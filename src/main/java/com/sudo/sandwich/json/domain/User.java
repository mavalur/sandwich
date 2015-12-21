package com.sudo.sandwich.json.domain;

import com.fasterxml.jackson.annotation.JsonAnySetter;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "user_name",
        "sys_id",
        "u_preferred_name",
        "name",
        "last_name",
        "first_name",
        "active",
        "department",
        "email",
        "u_employee_type",
        "mobile_phone",
        "notification",
        "u_avaya_extension",
        "vip",
        "u_vip_type"
})
public class User {
    @Id
    private String id;

    @JsonProperty("user_name")
    @TextIndexed
    private String userName;
    @JsonProperty("sys_id")
    private String sysId;
    @TextIndexed
    @JsonProperty("u_preferred_name")
    private String uPreferredName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("active")
    private String active;
    @JsonProperty("department")
    private String department;
    @JsonProperty("email")
    private String email;
    @JsonProperty("u_employee_type")
    private String uEmployeeType;
    @JsonProperty("mobile_phone")
    private String mobilePhone;
    @JsonProperty("notification")
    private Integer notification;
    @JsonProperty("u_avaya_extension")
    private String uAvayaExtension;
    @JsonProperty("vip")
    private String vip;
    @JsonProperty("u_vip_type")
    private String uVipType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The userName
     */
    @JsonProperty("user_name")
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName The user_name
     */
    @JsonProperty("user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return The sysId
     */
    @JsonProperty("sys_id")
    public String getSysId() {
        return sysId;
    }

    /**
     * @param sysId The sys_id
     */
    @JsonProperty("sys_id")
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     * @return The uPreferredName
     */
    @JsonProperty("u_preferred_name")
    public String getUPreferredName() {
        return uPreferredName;
    }

    /**
     * @param uPreferredName The u_preferred_name
     */
    @JsonProperty("u_preferred_name")
    public void setUPreferredName(String uPreferredName) {
        this.uPreferredName = uPreferredName;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return The active
     */
    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    /**
     * @param active The active
     */
    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * @return The department
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * @param department The department
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The uEmployeeType
     */
    @JsonProperty("u_employee_type")
    public String getUEmployeeType() {
        return uEmployeeType;
    }

    /**
     * @param uEmployeeType The u_employee_type
     */
    @JsonProperty("u_employee_type")
    public void setUEmployeeType(String uEmployeeType) {
        this.uEmployeeType = uEmployeeType;
    }

    /**
     * @return The mobilePhone
     */
    @JsonProperty("mobile_phone")
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * @param mobilePhone The mobile_phone
     */
    @JsonProperty("mobile_phone")
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return The notification
     */
    @JsonProperty("notification")
    public Integer getNotification() {
        return notification;
    }

    /**
     * @param notification The notification
     */
    @JsonProperty("notification")
    public void setNotification(Integer notification) {
        this.notification = notification;
    }

    /**
     * @return The uAvayaExtension
     */
    @JsonProperty("u_avaya_extension")
    public String getUAvayaExtension() {
        return uAvayaExtension;
    }

    /**
     * @param uAvayaExtension The u_avaya_extension
     */
    @JsonProperty("u_avaya_extension")
    public void setUAvayaExtension(String uAvayaExtension) {
        this.uAvayaExtension = uAvayaExtension;
    }

    /**
     * @return The vip
     */
    @JsonProperty("vip")
    public String getVip() {
        return vip;
    }

    /**
     * @param vip The vip
     */
    @JsonProperty("vip")
    public void setVip(String vip) {
        this.vip = vip;
    }

    /**
     * @return The uVipType
     */
    @JsonProperty("u_vip_type")
    public String getUVipType() {
        return uVipType;
    }

    /**
     * @param uVipType The u_vip_type
     */
    @JsonProperty("u_vip_type")
    public void setUVipType(String uVipType) {
        this.uVipType = uVipType;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}