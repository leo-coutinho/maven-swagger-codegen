package com.qantas.task.profile.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-17T11:50:16.623+10:00")

public class Address   {
  @JsonProperty("unitType")
  private String unitType = null;

  @JsonProperty("unitNumber")
  private String unitNumber = null;

  @JsonProperty("floorType")
  private String floorType = null;

  @JsonProperty("floorNumber")
  private String floorNumber = null;

  @JsonProperty("streetNumber")
  private String streetNumber = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("streetType")
  private String streetType = null;

  @JsonProperty("suburb")
  private String suburb = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("postcode")
  private String postcode = null;

  public Address unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @ApiModelProperty(value = "")


  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }

  public Address unitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

   /**
   * Get unitNumber
   * @return unitNumber
  **/
  @ApiModelProperty(value = "")


  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public Address floorType(String floorType) {
    this.floorType = floorType;
    return this;
  }

   /**
   * Get floorType
   * @return floorType
  **/
  @ApiModelProperty(value = "")


  public String getFloorType() {
    return floorType;
  }

  public void setFloorType(String floorType) {
    this.floorType = floorType;
  }

  public Address floorNumber(String floorNumber) {
    this.floorNumber = floorNumber;
    return this;
  }

   /**
   * Get floorNumber
   * @return floorNumber
  **/
  @ApiModelProperty(value = "")


  public String getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(String floorNumber) {
    this.floorNumber = floorNumber;
  }

  public Address streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(min=1)
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(min=1)
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

   /**
   * Get streetType
   * @return streetType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(min=1)
  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public Address suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * Get suburb
   * @return suburb
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(min=1)
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(min=2,max=3)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Pattern(regexp="^(\\d{4})$")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.unitType, address.unitType) &&
        Objects.equals(this.unitNumber, address.unitNumber) &&
        Objects.equals(this.floorType, address.floorType) &&
        Objects.equals(this.floorNumber, address.floorNumber) &&
        Objects.equals(this.streetNumber, address.streetNumber) &&
        Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.streetType, address.streetType) &&
        Objects.equals(this.suburb, address.suburb) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postcode, address.postcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitType, unitNumber, floorType, floorNumber, streetNumber, streetName, streetType, suburb, state, postcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    floorType: ").append(toIndentedString(floorType)).append("\n");
    sb.append("    floorNumber: ").append(toIndentedString(floorNumber)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
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

