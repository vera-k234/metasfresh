/*
 * Aufträge - Warenwirtschaft (Basis)
 * Synchronisation der Bestellungen aus Alberta mit den Aufträgen mit der Warenwirtschaft
 *
 * OpenAPI spec version: 1.0.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.PrescriptedArticleLine;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
/**
 * PrescriptionRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-08T07:58:57.853Z[GMT]")
public class PrescriptionRequest {
  @SerializedName("_id")
  private String _id = null;

  @SerializedName("patientId")
  private String patientId = null;

  @SerializedName("patientBirthday")
  private LocalDate patientBirthday = null;

  @SerializedName("orderId")
  private String orderId = null;

  @SerializedName("prescriptionType")
  private BigDecimal prescriptionType = null;

  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("deliveryDate")
  private LocalDate deliveryDate = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("accountingMonths")
  private List<BigDecimal> accountingMonths = null;

  @SerializedName("doctorId")
  private String doctorId = null;

  @SerializedName("pharmacyId")
  private String pharmacyId = null;

  @SerializedName("therapyId")
  private BigDecimal therapyId = null;

  @SerializedName("therapyTypeIds")
  private List<BigDecimal> therapyTypeIds = null;

  @SerializedName("prescriptedArticleLines")
  private List<PrescriptedArticleLine> prescriptedArticleLines = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("annotation")
  private Boolean annotation = null;

  @SerializedName("archived")
  private Boolean archived = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  public PrescriptionRequest _id(String _id) {
    this._id = _id;
    return this;
  }

   /**
   * Get _id
   * @return _id
  **/
  @Schema(example = "a4adecb6-126a-4fa6-8fac-e80165ac8980 -> muss bei POST leer bleiben", description = "")
  public String getId() {
    return _id;
  }

  public void setId(String _id) {
    this._id = _id;
  }

  public PrescriptionRequest patientId(String patientId) {
    this.patientId = patientId;
    return this;
  }

   /**
   * Id des Patienten in Alberta
   * @return patientId
  **/
  @Schema(example = "a4adecb6-126a-4fa6-8fac-e80165ac4264", required = true, description = "Id des Patienten in Alberta")
  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  public PrescriptionRequest patientBirthday(LocalDate patientBirthday) {
    this.patientBirthday = patientBirthday;
    return this;
  }

   /**
   * Id des Patienten in Alberta
   * @return patientBirthday
  **/
  @Schema(description = "Id des Patienten in Alberta")
  public LocalDate getPatientBirthday() {
    return patientBirthday;
  }

  public void setPatientBirthday(LocalDate patientBirthday) {
    this.patientBirthday = patientBirthday;
  }

  public PrescriptionRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Id der zugrundliegenden Bestellung in Alberta
   * @return orderId
  **/
  @Schema(example = "e86e86cf-b1d3-45eb-9c29-a921ce9dce74", description = "Id der zugrundliegenden Bestellung in Alberta")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PrescriptionRequest prescriptionType(BigDecimal prescriptionType) {
    this.prescriptionType = prescriptionType;
    return this;
  }

   /**
   * Rezepttyp (0 &#x3D; Arzneimittel 1 &#x3D; Verbandstoffe 2 &#x3D; BtM-Rezept 3 &#x3D; Pflegehilfsmittel 4 &#x3D; Hilfsmittel zum Verbrauch bestimmt 5 &#x3D; Hilfsmittel zum Gebrauch bestimmt)
   * @return prescriptionType
  **/
  @Schema(example = "2", description = "Rezepttyp (0 = Arzneimittel 1 = Verbandstoffe 2 = BtM-Rezept 3 = Pflegehilfsmittel 4 = Hilfsmittel zum Verbrauch bestimmt 5 = Hilfsmittel zum Gebrauch bestimmt)")
  public BigDecimal getPrescriptionType() {
    return prescriptionType;
  }

  public void setPrescriptionType(BigDecimal prescriptionType) {
    this.prescriptionType = prescriptionType;
  }

  public PrescriptionRequest creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PrescriptionRequest deliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Get deliveryDate
   * @return deliveryDate
  **/
  @Schema(example = "Thu Nov 14 00:00:00 GMT 2019", required = true, description = "")
  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public PrescriptionRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Versorgungsbeginn
   * @return startDate
  **/
  @Schema(example = "Thu Nov 14 00:00:00 GMT 2019", description = "Versorgungsbeginn")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public PrescriptionRequest endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Versorgungsende
   * @return endDate
  **/
  @Schema(example = "Sat Dec 14 00:00:00 GMT 2019", description = "Versorgungsende")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public PrescriptionRequest accountingMonths(List<BigDecimal> accountingMonths) {
    this.accountingMonths = accountingMonths;
    return this;
  }

  public PrescriptionRequest addAccountingMonthsItem(BigDecimal accountingMonthsItem) {
    if (this.accountingMonths == null) {
      this.accountingMonths = new ArrayList<BigDecimal>();
    }
    this.accountingMonths.add(accountingMonthsItem);
    return this;
  }

   /**
   * Auflistung der Versorgungs-/Abrechnungsmonate 1,2 &#x3D;&gt; Januar, Februar
   * @return accountingMonths
  **/
  @Schema(description = "Auflistung der Versorgungs-/Abrechnungsmonate 1,2 => Januar, Februar")
  public List<BigDecimal> getAccountingMonths() {
    return accountingMonths;
  }

  public void setAccountingMonths(List<BigDecimal> accountingMonths) {
    this.accountingMonths = accountingMonths;
  }

  public PrescriptionRequest doctorId(String doctorId) {
    this.doctorId = doctorId;
    return this;
  }

   /**
   * Voraussetzung, Alberta-Id ist bereits durch initialen Abgleich in WaWi vorhanden
   * @return doctorId
  **/
  @Schema(example = "5ab23c369d69c74b68cff5f7", required = true, description = "Voraussetzung, Alberta-Id ist bereits durch initialen Abgleich in WaWi vorhanden")
  public String getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(String doctorId) {
    this.doctorId = doctorId;
  }

  public PrescriptionRequest pharmacyId(String pharmacyId) {
    this.pharmacyId = pharmacyId;
    return this;
  }

   /**
   * Id der Apotheke bei PE/IV-Therapien (Voraussetzung, Alberta-Id ist bereits durch initialen Abgleich in WaWi vorhanden)
   * @return pharmacyId
  **/
  @Schema(example = "5ab2379c9d69c74b68cee819", description = "Id der Apotheke bei PE/IV-Therapien (Voraussetzung, Alberta-Id ist bereits durch initialen Abgleich in WaWi vorhanden)")
  public String getPharmacyId() {
    return pharmacyId;
  }

  public void setPharmacyId(String pharmacyId) {
    this.pharmacyId = pharmacyId;
  }

  public PrescriptionRequest therapyId(BigDecimal therapyId) {
    this.therapyId = therapyId;
    return this;
  }

   /**
   * Therapie, für die der Vertrag gilt (0&#x3D; Unbekannt, 1 &#x3D; Parenterale Ernährung, 2 &#x3D; Enterale Ernährung, 3 &#x3D; Stoma, 4 &#x3D; Tracheostoma, 5 &#x3D; Inkontinenz ableitend, 6 &#x3D; Wundversorgung, 7 &#x3D; IV-Therapien, 8 &#x3D; Beatmung, 9 &#x3D; Sonstiges, 10 &#x3D; OSA, 11 &#x3D; Hustenhilfen, 12 &#x3D; Absaugung, 13 &#x3D; Patientenüberwachung, 14 &#x3D; Sauerstoff, 15 &#x3D; Inhalations- und Atemtherapie, 16 &#x3D; Lagerungshilfsmittel, 17 &#x3D; Immuntherapie, 18 &#x3D; Rehydration)
   * @return therapyId
  **/
  @Schema(example = "3", required = true, description = "Therapie, für die der Vertrag gilt (0= Unbekannt, 1 = Parenterale Ernährung, 2 = Enterale Ernährung, 3 = Stoma, 4 = Tracheostoma, 5 = Inkontinenz ableitend, 6 = Wundversorgung, 7 = IV-Therapien, 8 = Beatmung, 9 = Sonstiges, 10 = OSA, 11 = Hustenhilfen, 12 = Absaugung, 13 = Patientenüberwachung, 14 = Sauerstoff, 15 = Inhalations- und Atemtherapie, 16 = Lagerungshilfsmittel, 17 = Immuntherapie, 18 = Rehydration)")
  public BigDecimal getTherapyId() {
    return therapyId;
  }

  public void setTherapyId(BigDecimal therapyId) {
    this.therapyId = therapyId;
  }

  public PrescriptionRequest therapyTypeIds(List<BigDecimal> therapyTypeIds) {
    this.therapyTypeIds = therapyTypeIds;
    return this;
  }

  public PrescriptionRequest addTherapyTypeIdsItem(BigDecimal therapyTypeIdsItem) {
    if (this.therapyTypeIds == null) {
      this.therapyTypeIds = new ArrayList<BigDecimal>();
    }
    this.therapyTypeIds.add(therapyTypeIdsItem);
    return this;
  }

   /**
   * Get therapyTypeIds
   * @return therapyTypeIds
  **/
  @Schema(description = "")
  public List<BigDecimal> getTherapyTypeIds() {
    return therapyTypeIds;
  }

  public void setTherapyTypeIds(List<BigDecimal> therapyTypeIds) {
    this.therapyTypeIds = therapyTypeIds;
  }

  public PrescriptionRequest prescriptedArticleLines(List<PrescriptedArticleLine> prescriptedArticleLines) {
    this.prescriptedArticleLines = prescriptedArticleLines;
    return this;
  }

  public PrescriptionRequest addPrescriptedArticleLinesItem(PrescriptedArticleLine prescriptedArticleLinesItem) {
    if (this.prescriptedArticleLines == null) {
      this.prescriptedArticleLines = new ArrayList<PrescriptedArticleLine>();
    }
    this.prescriptedArticleLines.add(prescriptedArticleLinesItem);
    return this;
  }

   /**
   * Die einzelnen Zeilen der Rezeptanforderung mit Artikeln
   * @return prescriptedArticleLines
  **/
  @Schema(description = "Die einzelnen Zeilen der Rezeptanforderung mit Artikeln")
  public List<PrescriptedArticleLine> getPrescriptedArticleLines() {
    return prescriptedArticleLines;
  }

  public void setPrescriptedArticleLines(List<PrescriptedArticleLine> prescriptedArticleLines) {
    this.prescriptedArticleLines = prescriptedArticleLines;
  }

  public PrescriptionRequest createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Id des erstellenden Benutzers (Voraussetzung, Alberta-Id ist bereits durch initialen Abgleich der Benutzer in WaWi vorhanden)
   * @return createdBy
  **/
  @Schema(example = "5a6ca8b6456c14307cb9ae35", description = "Id des erstellenden Benutzers (Voraussetzung, Alberta-Id ist bereits durch initialen Abgleich der Benutzer in WaWi vorhanden)")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public PrescriptionRequest annotation(Boolean annotation) {
    this.annotation = annotation;
    return this;
  }

   /**
   * Bemerkung
   * @return annotation
  **/
  @Schema(example = "false", description = "Bemerkung")
  public Boolean isAnnotation() {
    return annotation;
  }

  public void setAnnotation(Boolean annotation) {
    this.annotation = annotation;
  }

  public PrescriptionRequest archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Kennzeichen ob Rezeptanforderung archiviert ist oder nicht
   * @return archived
  **/
  @Schema(example = "false", description = "Kennzeichen ob Rezeptanforderung archiviert ist oder nicht")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public PrescriptionRequest timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Der Zeitstempel der letzten Datenbankänderung
   * @return timestamp
  **/
  @Schema(description = "Der Zeitstempel der letzten Datenbankänderung")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public PrescriptionRequest updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Der Zeitstempel der letzten Änderung
   * @return updated
  **/
  @Schema(description = "Der Zeitstempel der letzten Änderung")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrescriptionRequest prescriptionRequest = (PrescriptionRequest) o;
    return Objects.equals(this._id, prescriptionRequest._id) &&
        Objects.equals(this.patientId, prescriptionRequest.patientId) &&
        Objects.equals(this.patientBirthday, prescriptionRequest.patientBirthday) &&
        Objects.equals(this.orderId, prescriptionRequest.orderId) &&
        Objects.equals(this.prescriptionType, prescriptionRequest.prescriptionType) &&
        Objects.equals(this.creationDate, prescriptionRequest.creationDate) &&
        Objects.equals(this.deliveryDate, prescriptionRequest.deliveryDate) &&
        Objects.equals(this.startDate, prescriptionRequest.startDate) &&
        Objects.equals(this.endDate, prescriptionRequest.endDate) &&
        Objects.equals(this.accountingMonths, prescriptionRequest.accountingMonths) &&
        Objects.equals(this.doctorId, prescriptionRequest.doctorId) &&
        Objects.equals(this.pharmacyId, prescriptionRequest.pharmacyId) &&
        Objects.equals(this.therapyId, prescriptionRequest.therapyId) &&
        Objects.equals(this.therapyTypeIds, prescriptionRequest.therapyTypeIds) &&
        Objects.equals(this.prescriptedArticleLines, prescriptionRequest.prescriptedArticleLines) &&
        Objects.equals(this.createdBy, prescriptionRequest.createdBy) &&
        Objects.equals(this.annotation, prescriptionRequest.annotation) &&
        Objects.equals(this.archived, prescriptionRequest.archived) &&
        Objects.equals(this.timestamp, prescriptionRequest.timestamp) &&
        Objects.equals(this.updated, prescriptionRequest.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, patientId, patientBirthday, orderId, prescriptionType, creationDate, deliveryDate, startDate, endDate, accountingMonths, doctorId, pharmacyId, therapyId, therapyTypeIds, prescriptedArticleLines, createdBy, annotation, archived, timestamp, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrescriptionRequest {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    patientBirthday: ").append(toIndentedString(patientBirthday)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    prescriptionType: ").append(toIndentedString(prescriptionType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    accountingMonths: ").append(toIndentedString(accountingMonths)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    pharmacyId: ").append(toIndentedString(pharmacyId)).append("\n");
    sb.append("    therapyId: ").append(toIndentedString(therapyId)).append("\n");
    sb.append("    therapyTypeIds: ").append(toIndentedString(therapyTypeIds)).append("\n");
    sb.append("    prescriptedArticleLines: ").append(toIndentedString(prescriptedArticleLines)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
