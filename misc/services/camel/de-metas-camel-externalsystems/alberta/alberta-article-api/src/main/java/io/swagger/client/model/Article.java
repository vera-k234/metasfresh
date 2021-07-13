/*
 * #%L
 * alberta-article-api
 * %%
 * Copyright (C) 2021 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

/*
 * Artikel - Warenwirtschaft (Basis)
 * Synchronisation der Artikel mit Kumavision
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Article
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-11T10:09:42.333Z[GMT]")
public class Article {
  @SerializedName("customerNumber")
  private String customerNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("additionalDescription")
  private String additionalDescription = null;

  @SerializedName("manufacturer")
  private String manufacturer = null;

  @SerializedName("manufacturerNumber")
  private String manufacturerNumber = null;

  @SerializedName("therapyIds")
  private List<String> therapyIds = null;

  @SerializedName("billableTherapies")
  private List<String> billableTherapies = null;

  @SerializedName("productGroupId")
  private String productGroupId = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("inventoryType")
  private BigDecimal inventoryType = null;

  @SerializedName("status")
  private BigDecimal status = null;

  @SerializedName("medicalAidPositionNumber")
  private String medicalAidPositionNumber = null;

  @SerializedName("stars")
  private BigDecimal stars = null;

  @SerializedName("assortmentType")
  private BigDecimal assortmentType = null;

  @SerializedName("pharmacyPrice")
  private String pharmacyPrice = null;

  @SerializedName("fixedPrice")
  private String fixedPrice = null;

  @SerializedName("purchaseRating")
  private BigDecimal purchaseRating = null;

  @SerializedName("packagingUnits")
  private List<PackagingUnit> packagingUnits = new ArrayList<PackagingUnit>();

  public Article customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Eindeutige Nummer aus der Warenwirtschaft
   * @return customerNumber
  **/
  @Schema(example = "17373", required = true, description = "Eindeutige Nummer aus der Warenwirtschaft")
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public Article name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name des Artikels
   * @return name
  **/
  @Schema(example = "BLUE LINE Ultra Innenkan Gr9", required = true, description = "Name des Artikels")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Article description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Beschreibung des Artikels
   * @return description
  **/
  @Schema(example = "Innenkan mit Fen", description = "Beschreibung des Artikels")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Article additionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
    return this;
  }

   /**
   * Zusatzbeschreibung des Artikels
   * @return additionalDescription
  **/
  @Schema(example = "Niederprofilansatz, gefenstert", description = "Zusatzbeschreibung des Artikels")
  public String getAdditionalDescription() {
    return additionalDescription;
  }

  public void setAdditionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
  }

  public Article manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Name des Herstellers
   * @return manufacturer
  **/
  @Schema(example = "Smiths Medical Deutschland GmbH", description = "Name des Herstellers")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Article manufacturerNumber(String manufacturerNumber) {
    this.manufacturerNumber = manufacturerNumber;
    return this;
  }

   /**
   * Herstellernummer des Artikels
   * @return manufacturerNumber
  **/
  @Schema(example = "100/851/090", description = "Herstellernummer des Artikels")
  public String getManufacturerNumber() {
    return manufacturerNumber;
  }

  public void setManufacturerNumber(String manufacturerNumber) {
    this.manufacturerNumber = manufacturerNumber;
  }

  public Article therapyIds(List<String> therapyIds) {
    this.therapyIds = therapyIds;
    return this;
  }

  public Article addTherapyIdsItem(String therapyIdsItem) {
    if (this.therapyIds == null) {
      this.therapyIds = new ArrayList<String>();
    }
    this.therapyIds.add(therapyIdsItem);
    return this;
  }

   /**
   * Auflistung der Therapien, in denen der Artikel verwendet wird (0&#x3D; Unbekannt, 1 &#x3D; Parenterale Ernährung, 2 &#x3D; Enterale Ernährung, 3 &#x3D; Stoma, 4 &#x3D; Tracheostoma, 5 &#x3D; Inkontinenz ableitend, 6 &#x3D; Wundversorgung, 7 &#x3D; IV-Therapien, 8 &#x3D; Beatmung, 9 &#x3D; Sonstiges, 10 &#x3D; OSA, 11 &#x3D; Hustenhilfen, 12 &#x3D; Absaugung, 13 &#x3D; Patientenüberwachung, 14 &#x3D; Sauerstoff, 15 &#x3D; Inhalations- und Atemtherapie, 16 &#x3D; Lagerungshilfsmittel, 17 &#x3D; Schmerztherapie)
   * @return therapyIds
  **/
  @Schema(example = "[4]", description = "Auflistung der Therapien, in denen der Artikel verwendet wird (0= Unbekannt, 1 = Parenterale Ernährung, 2 = Enterale Ernährung, 3 = Stoma, 4 = Tracheostoma, 5 = Inkontinenz ableitend, 6 = Wundversorgung, 7 = IV-Therapien, 8 = Beatmung, 9 = Sonstiges, 10 = OSA, 11 = Hustenhilfen, 12 = Absaugung, 13 = Patientenüberwachung, 14 = Sauerstoff, 15 = Inhalations- und Atemtherapie, 16 = Lagerungshilfsmittel, 17 = Schmerztherapie)")
  public List<String> getTherapyIds() {
    return therapyIds;
  }

  public void setTherapyIds(List<String> therapyIds) {
    this.therapyIds = therapyIds;
  }

  public Article billableTherapies(List<String> billableTherapies) {
    this.billableTherapies = billableTherapies;
    return this;
  }

  public Article addBillableTherapiesItem(String billableTherapiesItem) {
    if (this.billableTherapies == null) {
      this.billableTherapies = new ArrayList<String>();
    }
    this.billableTherapies.add(billableTherapiesItem);
    return this;
  }

   /**
   * Auflistung der abrechenbaren Therapien für den Artikel (siehe therapies)
   * @return billableTherapies
  **/
  @Schema(example = "[4]", description = "Auflistung der abrechenbaren Therapien für den Artikel (siehe therapies)")
  public List<String> getBillableTherapies() {
    return billableTherapies;
  }

  public void setBillableTherapies(List<String> billableTherapies) {
    this.billableTherapies = billableTherapies;
  }

  public Article productGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
    return this;
  }

   /**
   * Id der Warengruppe (Voraussetzung, Alberta-Id ist bereits durch initialen Abgleich der Warengruppen in WaWi vorhanden)
   * @return productGroupId
  **/
  @Schema(example = "9a4a09b6-8988-4745-8311-f8dd49df1829", description = "Id der Warengruppe (Voraussetzung, Alberta-Id ist bereits durch initialen Abgleich der Warengruppen in WaWi vorhanden)")
  public String getProductGroupId() {
    return productGroupId;
  }

  public void setProductGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
  }

  public Article size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Die Beschreibung der Größe
   * @return size
  **/
  @Schema(example = "IDM 9 mm", description = "Die Beschreibung der Größe")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Article inventoryType(BigDecimal inventoryType) {
    this.inventoryType = inventoryType;
    return this;
  }

   /**
   * Art der Bevorratung 1&#x3D;Lagerartikel / 2&#x3D;Kommisionnierartikel
   * @return inventoryType
  **/
  @Schema(example = "1", description = "Art der Bevorratung 1=Lagerartikel / 2=Kommisionnierartikel")
  public BigDecimal getInventoryType() {
    return inventoryType;
  }

  public void setInventoryType(BigDecimal inventoryType) {
    this.inventoryType = inventoryType;
  }

  public Article status(BigDecimal status) {
    this.status = status;
    return this;
  }

   /**
   * Status des Artikels (0&#x3D; Unbekannt, 1&#x3D;Verfügbar, 2&#x3D;Gesperrt, 3&#x3D;Temporär nicht verfügbar, 4&#x3D;Endgültig nicht verfügbar\&quot;)
   * @return status
  **/
  @Schema(example = "1", description = "Status des Artikels (0= Unbekannt, 1=Verfügbar, 2=Gesperrt, 3=Temporär nicht verfügbar, 4=Endgültig nicht verfügbar\")")
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public Article medicalAidPositionNumber(String medicalAidPositionNumber) {
    this.medicalAidPositionNumber = medicalAidPositionNumber;
    return this;
  }

   /**
   * Hilfsmittelpositionsnummer
   * @return medicalAidPositionNumber
  **/
  @Schema(example = "12.24.06.2025", description = "Hilfsmittelpositionsnummer")
  public String getMedicalAidPositionNumber() {
    return medicalAidPositionNumber;
  }

  public void setMedicalAidPositionNumber(String medicalAidPositionNumber) {
    this.medicalAidPositionNumber = medicalAidPositionNumber;
  }

  public Article stars(BigDecimal stars) {
    this.stars = stars;
    return this;
  }

   /**
   * Sterneranking des einzelnen Artikels im Warenkorb, falls keine Wirtschaftlichkeitsberechnung gewünscht
   * @return stars
  **/
  @Schema(example = "3", description = "Sterneranking des einzelnen Artikels im Warenkorb, falls keine Wirtschaftlichkeitsberechnung gewünscht")
  public BigDecimal getStars() {
    return stars;
  }

  public void setStars(BigDecimal stars) {
    this.stars = stars;
  }

  public Article assortmentType(BigDecimal assortmentType) {
    this.assortmentType = assortmentType;
    return this;
  }

   /**
   * Sortimentsart (0&#x3D;Unbekannt / 1&#x3D;Fokusartikel / 2&#x3D;Standardartikel / 3&#x3D;Randartikel) - beeinflusst die Darstellung im Warenkorb
   * @return assortmentType
  **/
  @Schema(example = "1", description = "Sortimentsart (0=Unbekannt / 1=Fokusartikel / 2=Standardartikel / 3=Randartikel) - beeinflusst die Darstellung im Warenkorb")
  public BigDecimal getAssortmentType() {
    return assortmentType;
  }

  public void setAssortmentType(BigDecimal assortmentType) {
    this.assortmentType = assortmentType;
  }

  public Article pharmacyPrice(String pharmacyPrice) {
    this.pharmacyPrice = pharmacyPrice;
    return this;
  }

   /**
   * Der Apothekeneinkaufspreis des Artikels (AEP)
   * @return pharmacyPrice
  **/
  @Schema(example = "1,99", description = "Der Apothekeneinkaufspreis des Artikels (AEP)")
  public String getPharmacyPrice() {
    return pharmacyPrice;
  }

  public void setPharmacyPrice(String pharmacyPrice) {
    this.pharmacyPrice = pharmacyPrice;
  }

  public Article fixedPrice(String fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

   /**
   * Der Festbetrag des Artikels
   * @return fixedPrice
  **/
  @Schema(example = "2,10", description = "Der Festbetrag des Artikels")
  public String getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(String fixedPrice) {
    this.fixedPrice = fixedPrice;
  }

  public Article purchaseRating(BigDecimal purchaseRating) {
    this.purchaseRating = purchaseRating;
    return this;
  }

   /**
   * Rating (virtueller Rabatt) für die Wirtschaftlichkeitsberechung - Werte von 0 bis 6  (0 &#x3D; sehr wirtschaftlich 6 &#x3D; nicht wirtschaftlich)
   * @return purchaseRating
  **/
  @Schema(example = "0", description = "Rating (virtueller Rabatt) für die Wirtschaftlichkeitsberechung - Werte von 0 bis 6  (0 = sehr wirtschaftlich 6 = nicht wirtschaftlich)")
  public BigDecimal getPurchaseRating() {
    return purchaseRating;
  }

  public void setPurchaseRating(BigDecimal purchaseRating) {
    this.purchaseRating = purchaseRating;
  }

  public Article packagingUnits(List<PackagingUnit> packagingUnits) {
    this.packagingUnits = packagingUnits;
    return this;
  }

  public Article addPackagingUnitsItem(PackagingUnit packagingUnitsItem) {
    this.packagingUnits.add(packagingUnitsItem);
    return this;
  }

   /**
   * Get packagingUnits
   * @return packagingUnits
  **/
  @Schema(required = true, description = "")
  public List<PackagingUnit> getPackagingUnits() {
    return packagingUnits;
  }

  public void setPackagingUnits(List<PackagingUnit> packagingUnits) {
    this.packagingUnits = packagingUnits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this.customerNumber, article.customerNumber) &&
        Objects.equals(this.name, article.name) &&
        Objects.equals(this.description, article.description) &&
        Objects.equals(this.additionalDescription, article.additionalDescription) &&
        Objects.equals(this.manufacturer, article.manufacturer) &&
        Objects.equals(this.manufacturerNumber, article.manufacturerNumber) &&
        Objects.equals(this.therapyIds, article.therapyIds) &&
        Objects.equals(this.billableTherapies, article.billableTherapies) &&
        Objects.equals(this.productGroupId, article.productGroupId) &&
        Objects.equals(this.size, article.size) &&
        Objects.equals(this.inventoryType, article.inventoryType) &&
        Objects.equals(this.status, article.status) &&
        Objects.equals(this.medicalAidPositionNumber, article.medicalAidPositionNumber) &&
        Objects.equals(this.stars, article.stars) &&
        Objects.equals(this.assortmentType, article.assortmentType) &&
        Objects.equals(this.pharmacyPrice, article.pharmacyPrice) &&
        Objects.equals(this.fixedPrice, article.fixedPrice) &&
        Objects.equals(this.purchaseRating, article.purchaseRating) &&
        Objects.equals(this.packagingUnits, article.packagingUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, name, description, additionalDescription, manufacturer, manufacturerNumber, therapyIds, billableTherapies, productGroupId, size, inventoryType, status, medicalAidPositionNumber, stars, assortmentType, pharmacyPrice, fixedPrice, purchaseRating, packagingUnits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    additionalDescription: ").append(toIndentedString(additionalDescription)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerNumber: ").append(toIndentedString(manufacturerNumber)).append("\n");
    sb.append("    therapyIds: ").append(toIndentedString(therapyIds)).append("\n");
    sb.append("    billableTherapies: ").append(toIndentedString(billableTherapies)).append("\n");
    sb.append("    productGroupId: ").append(toIndentedString(productGroupId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    medicalAidPositionNumber: ").append(toIndentedString(medicalAidPositionNumber)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    assortmentType: ").append(toIndentedString(assortmentType)).append("\n");
    sb.append("    pharmacyPrice: ").append(toIndentedString(pharmacyPrice)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    purchaseRating: ").append(toIndentedString(purchaseRating)).append("\n");
    sb.append("    packagingUnits: ").append(toIndentedString(packagingUnits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
