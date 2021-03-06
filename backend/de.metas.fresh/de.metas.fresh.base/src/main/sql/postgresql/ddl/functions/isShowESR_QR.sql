DROP FUNCTION IF EXISTS report.isShowESR_QR(IN p_AD_Client_ID numeric, IN p_AD_Org_ID numeric);

create or replace function report.isShowESR_QR(IN p_AD_Client_ID numeric, IN p_AD_Org_ID numeric) RETURNS CHAR AS
$$
DECLARE
    isShowESR_QR CHAR DEFAULT 'Y';
BEGIN
 
        SELECT VALUE
        INTO isShowESR_QR
        from AD_SysConfig
        where Name = 'de.metas.payment.esr.Enabled' AND AD_Client_ID IN (0,1000000) AND AD_Org_ID IN (0, p_AD_Org_ID) AND IsActive='Y'
		ORDER BY AD_Org_ID DESC, AD_Client_ID DESC LIMIT 1;

    return isShowESR_QR;
END
$$
    LANGUAGE plpgsql;