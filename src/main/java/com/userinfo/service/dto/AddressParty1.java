package com.userinfo.service.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * AddressParty1
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-08T07:00:35.342Z")

public class AddressParty1   {
  @JsonProperty("AddressId")
  private Integer addressId = null;

  @JsonProperty("CompanyName")
  private String companyName = null;

  @JsonProperty("PartyName")
  private String partyName = null;

  @JsonProperty("WorkPhoneNumber")
  private String workPhoneNumber = null;

  @JsonProperty("MobileNumber")
  private String mobileNumber = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("PostCode")
  private String postCode = null;

  @JsonProperty("State")
  private String state = null;

  @JsonProperty("CountryCode")
  private String countryCode = null;

  @JsonProperty("AddressNote")
  private String addressNote = null;

  @JsonProperty("AccountCode")
  private String accountCode = null;

  @JsonProperty("ReceiverAddressType")
  private String receiverAddressType = null;

  @JsonProperty("BusinesstaxNumber")
  private String businesstaxNumber = null;

  @JsonProperty("AddressType")
  private String addressType = null;

  @JsonProperty("CreatedTs")
  private DateTime createdTs = null;

  @JsonProperty("CreatedBy")
  private String createdBy = null;

  @JsonProperty("LastModifiedTs")
  private DateTime lastModifiedTs = null;

  @JsonProperty("LastModifiedBy")
  private String lastModifiedBy = null;

  public AddressParty1 addressId(Integer addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Get addressId
   * @return addressId
  **/
  @ApiModelProperty(value = "")
  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }

  public AddressParty1 companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public AddressParty1 partyName(String partyName) {
    this.partyName = partyName;
    return this;
  }

   /**
   * Get partyName
   * @return partyName
  **/
  @ApiModelProperty(value = "")
  public String getPartyName() {
    return partyName;
  }

  public void setPartyName(String partyName) {
    this.partyName = partyName;
  }

  public AddressParty1 workPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
    return this;
  }

   /**
   * Get workPhoneNumber
   * @return workPhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getWorkPhoneNumber() {
    return workPhoneNumber;
  }

  public void setWorkPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
  }

  public AddressParty1 mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public AddressParty1 email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddressParty1 postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(value = "")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public AddressParty1 state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressParty1 countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressParty1 addressNote(String addressNote) {
    this.addressNote = addressNote;
    return this;
  }

   /**
   * Get addressNote
   * @return addressNote
  **/
  @ApiModelProperty(value = "")
  public String getAddressNote() {
    return addressNote;
  }

  public void setAddressNote(String addressNote) {
    this.addressNote = addressNote;
  }

  public AddressParty1 accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * Get accountCode
   * @return accountCode
  **/
  @ApiModelProperty(value = "")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public AddressParty1 receiverAddressType(String receiverAddressType) {
    this.receiverAddressType = receiverAddressType;
    return this;
  }

   /**
   * Get receiverAddressType
   * @return receiverAddressType
  **/
  @ApiModelProperty(value = "")
  public String getReceiverAddressType() {
    return receiverAddressType;
  }

  public void setReceiverAddressType(String receiverAddressType) {
    this.receiverAddressType = receiverAddressType;
  }

  public AddressParty1 businesstaxNumber(String businesstaxNumber) {
    this.businesstaxNumber = businesstaxNumber;
    return this;
  }

   /**
   * Get businesstaxNumber
   * @return businesstaxNumber
  **/
  @ApiModelProperty(value = "")
  public String getBusinesstaxNumber() {
    return businesstaxNumber;
  }

  public void setBusinesstaxNumber(String businesstaxNumber) {
    this.businesstaxNumber = businesstaxNumber;
  }

  public AddressParty1 addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public AddressParty1 createdTs(DateTime createdTs) {
    this.createdTs = createdTs;
    return this;
  }

   /**
   * Get createdTs
   * @return createdTs
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedTs() {
    return createdTs;
  }

  public void setCreatedTs(DateTime createdTs) {
    this.createdTs = createdTs;
  }

  public AddressParty1 createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AddressParty1 lastModifiedTs(DateTime lastModifiedTs) {
    this.lastModifiedTs = lastModifiedTs;
    return this;
  }

   /**
   * Get lastModifiedTs
   * @return lastModifiedTs
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastModifiedTs() {
    return lastModifiedTs;
  }

  public void setLastModifiedTs(DateTime lastModifiedTs) {
    this.lastModifiedTs = lastModifiedTs;
  }

  public AddressParty1 lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressParty1 addressParty1 = (AddressParty1) o;
    return Objects.equals(this.addressId, addressParty1.addressId) &&
        Objects.equals(this.companyName, addressParty1.companyName) &&
        Objects.equals(this.partyName, addressParty1.partyName) &&
        Objects.equals(this.workPhoneNumber, addressParty1.workPhoneNumber) &&
        Objects.equals(this.mobileNumber, addressParty1.mobileNumber) &&
        Objects.equals(this.email, addressParty1.email) &&
        Objects.equals(this.postCode, addressParty1.postCode) &&
        Objects.equals(this.state, addressParty1.state) &&
        Objects.equals(this.countryCode, addressParty1.countryCode) &&
        Objects.equals(this.addressNote, addressParty1.addressNote) &&
        Objects.equals(this.accountCode, addressParty1.accountCode) &&
        Objects.equals(this.receiverAddressType, addressParty1.receiverAddressType) &&
        Objects.equals(this.businesstaxNumber, addressParty1.businesstaxNumber) &&
        Objects.equals(this.addressType, addressParty1.addressType) &&
        Objects.equals(this.createdTs, addressParty1.createdTs) &&
        Objects.equals(this.createdBy, addressParty1.createdBy) &&
        Objects.equals(this.lastModifiedTs, addressParty1.lastModifiedTs) &&
        Objects.equals(this.lastModifiedBy, addressParty1.lastModifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, companyName, partyName, workPhoneNumber, mobileNumber, email, postCode, state, countryCode, addressNote, accountCode, receiverAddressType, businesstaxNumber, addressType, createdTs, createdBy, lastModifiedTs, lastModifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressParty1 {\n");
    
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    partyName: ").append(toIndentedString(partyName)).append("\n");
    sb.append("    workPhoneNumber: ").append(toIndentedString(workPhoneNumber)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    addressNote: ").append(toIndentedString(addressNote)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    receiverAddressType: ").append(toIndentedString(receiverAddressType)).append("\n");
    sb.append("    businesstaxNumber: ").append(toIndentedString(businesstaxNumber)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedTs: ").append(toIndentedString(lastModifiedTs)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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

