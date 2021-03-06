DROP FUNCTION IF EXISTS report.revenue_PO_report 
( 
	IN Base_Period_Start date,
	IN Base_Period_End date, 
	IN Comp_Period_Start date, 
	IN Comp_Period_End date, 
	IN issotrx character varying,
	IN C_BPartner_ID numeric, 
	IN C_Activity_ID numeric,
	IN M_Product_ID numeric,
	IN M_Product_Category_ID numeric,
	IN M_AttributeSetInstance_ID numeric,
	IN AD_Org_ID numeric,
	IN AD_Language Character Varying (6),
	IN C_BP_Group numeric
);
CREATE OR REPLACE FUNCTION report.revenue_PO_report 
( 
	IN Base_Period_Start date, --$1
	IN Base_Period_End date,  --$2
	IN Comp_Period_Start date,  --$3
	IN Comp_Period_End date,  --$4
	IN issotrx character varying, --$5
	IN C_BPartner_ID numeric,  --$6
	IN C_Activity_ID numeric, --$7
	IN M_Product_ID numeric, --$8
	IN M_Product_Category_ID numeric, --$9
	IN M_AttributeSetInstance_ID numeric, --$10
	IN AD_Org_ID numeric, --$11
	IN AD_Language Character Varying (6), --$12
	IN C_BP_Group numeric --$13
)
RETURNS TABLE
(
	bp_value character varying,
	bp_name character varying(60), 
	bpc_name character varying(60), 
	sameperiodsum numeric, 
	compperiodsum numeric, 
	revenue_change numeric,
	sameperiodPOsum numeric,
	sameperiodReqsum bigint, 
	PO_req_change numeric 
)
AS $$

SELECT 
	form.bp_value,
	form.bp_name,
	form.bpc_name,
	round(form.sameperiodsum) as sameperiodsum,
	round(form.compperiodsum) as compperiodsum,

	round(form.revenue_change,2) as revenue_change,
	form.sameperiodPOsum,
	form.sameperiodReqsum,
	
	round(form.PO_req_change,2) as PO_req_change


FROM(
SELECT 
	rez.bp_value,
	rez.bp_name,
	rez.bpc_name,
	COALESCE(rez.sameperiodsum, 0) as sameperiodsum,
	COALESCE(rez.compperiodsum, 0) as compperiodsum,

	CASE WHEN coalesce(rez.CompPeriodSum,0) != 0 THEN (coalesce(rez.SamePeriodSum,0) * 100 / rez.CompPeriodSum) ELSE 0 END as revenue_change,
	COALESCE(rez.sameperiodPOsum, 0) as sameperiodPOsum,
	COALESCE(rez.sameperiodReqsum, 0) as sameperiodReqsum,
	
	CASE WHEN coalesce(rez.sameperiodPOsum,0) != 0 THEN  (coalesce(rez.sameperiodReqsum,0) * 100 / rez.sameperiodPOsum ) ELSE 0 END as PO_req_change

FROM (
	SELECT
	bp.value as bp_value,
	bp.name as bp_name, 
	bpc.name as bpc_name,
	um_r.sameperiodsum as sameperiodsum, 
	um_r.compperiodsum as compperiodsum,
	
	(SELECT COUNT(*)::numeric as POsum FROM C_Order o
		WHERE issotrx = 'N' 
			AND o.dateOrdered >= $1 AND o.dateOrdered <= $2
			AND o.isActive = 'Y'
			AND o.C_BPartner_ID = bp.C_BPartner_ID
			AND o.ad_org_id = $11
	) as sameperiodPOsum,
	
	(select count(*)
		from
		(select count(*) cnt
		from  R_Request r
			WHERE r.datedelivered >= $1 AND r.datedelivered <= $2
			AND r.isActive = 'Y'
			AND r.C_BPartner_ID = bp.C_BPartner_ID 
			AND r.ad_org_id = $11
			AND r.R_RequestType_ID in (540006,540007,540005) 
			AND c_order_id is not null
			group by r.M_Product_ID, r.M_QualityNote_ID, r.c_order_id) t1
	) as sameperiodReqsum
	
	
	

	FROM C_BPartner bp

	LEFT JOIN report.umsatzliste_bpartner_report 
		(
			$1,$2,$3,$4,$5,$6,$7,$8,$9,$10,$11,$12
		) um_r ON bp.name = um_r.bp_name and um_r.unionorder=3

	LEFT JOIN C_BP_Group bpc ON bpc.C_BP_Group_ID = bp.C_BP_Group_ID 
	WHERE bp.ad_org_id = $11	and (CASE WHEN $13 is null then TRUE ELSE bpc.C_BP_Group_ID = $13 END)	
	GROUP BY 	
	bp.value,
	bp.name, bp.c_bpartner_id, bpc.name, sameperiodsum, compperiodsum
	order by bp.name
) rez


)form
;
$$
LANGUAGE sql STABLE;