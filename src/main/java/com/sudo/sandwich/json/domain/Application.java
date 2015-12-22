package com.sudo.sandwich.json.domain;

/**
 * Created by satishterala on 12/21/15.
 */

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
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "support_group",
        "subcategory",
        "u_business_unit",
        "busines_criticality",
        "u_type",
        "u_wmc_app_id",
        "u_wmc_central_category",
        "used_for",
        "u_support_tier_2",
        "u_level",
        "u_business_domain"
})
@Document(collection = "apps")
public class Application {

    @Version
    Long version;
    @Id
    private String id;
    @JsonProperty("support_group")
    private String supportGroup;
    @JsonProperty("subcategory")
    private String subcategory;
    @JsonProperty("u_business_unit")
    private String uBusinessUnit;
    @JsonProperty("busines_criticality")
    private String businesCriticality;
    @JsonProperty("u_type")
    private String uType;
    @JsonProperty("u_wmc_app_id")
    @TextIndexed
    private String uWmcAppId;
    @JsonProperty("u_wmc_central_category")
    private Object uWmcCentralCategory;
    @JsonProperty("used_for")
    private String usedFor;
    @JsonProperty("u_support_tier_2")
    private String uSupportTier2;
    @JsonProperty("u_level")
    private String uLevel;
    @TextIndexed
    @JsonProperty("u_business_domain")
    private String uBusinessDomain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The supportGroup
     */
    @JsonProperty("support_group")
    public String getSupportGroup() {
        return supportGroup;
    }

    /**
     * @param supportGroup The support_group
     */
    @JsonProperty("support_group")
    public void setSupportGroup(String supportGroup) {
        this.supportGroup = supportGroup;
    }

    /**
     * @return The subcategory
     */
    @JsonProperty("subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    /**
     * @param subcategory The subcategory
     */
    @JsonProperty("subcategory")
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    /**
     * @return The uBusinessUnit
     */
    @JsonProperty("u_business_unit")
    public String getUBusinessUnit() {
        return uBusinessUnit;
    }

    /**
     * @param uBusinessUnit The u_business_unit
     */
    @JsonProperty("u_business_unit")
    public void setUBusinessUnit(String uBusinessUnit) {
        this.uBusinessUnit = uBusinessUnit;
    }

    /**
     * @return The businesCriticality
     */
    @JsonProperty("busines_criticality")
    public String getBusinesCriticality() {
        return businesCriticality;
    }

    /**
     * @param businesCriticality The busines_criticality
     */
    @JsonProperty("busines_criticality")
    public void setBusinesCriticality(String businesCriticality) {
        this.businesCriticality = businesCriticality;
    }

    /**
     * @return The uType
     */
    @JsonProperty("u_type")
    public String getUType() {
        return uType;
    }

    /**
     * @param uType The u_type
     */
    @JsonProperty("u_type")
    public void setUType(String uType) {
        this.uType = uType;
    }

    /**
     * @return The uWmcAppId
     */
    @JsonProperty("u_wmc_app_id")
    public String getUWmcAppId() {
        return uWmcAppId;
    }

    /**
     * @param uWmcAppId The u_wmc_app_id
     */
    @JsonProperty("u_wmc_app_id")
    public void setUWmcAppId(String uWmcAppId) {
        this.uWmcAppId = uWmcAppId;
    }

    /**
     * @return The uWmcCentralCategory
     */
    @JsonProperty("u_wmc_central_category")
    public Object getUWmcCentralCategory() {
        return uWmcCentralCategory;
    }

    /**
     * @param uWmcCentralCategory The u_wmc_central_category
     */
    @JsonProperty("u_wmc_central_category")
    public void setUWmcCentralCategory(Object uWmcCentralCategory) {
        this.uWmcCentralCategory = uWmcCentralCategory;
    }

    /**
     * @return The usedFor
     */
    @JsonProperty("used_for")
    public String getUsedFor() {
        return usedFor;
    }

    /**
     * @param usedFor The used_for
     */
    @JsonProperty("used_for")
    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }

    /**
     * @return The uSupportTier2
     */
    @JsonProperty("u_support_tier_2")
    public String getUSupportTier2() {
        return uSupportTier2;
    }

    /**
     * @param uSupportTier2 The u_support_tier_2
     */
    @JsonProperty("u_support_tier_2")
    public void setUSupportTier2(String uSupportTier2) {
        this.uSupportTier2 = uSupportTier2;
    }

    /**
     * @return The uLevel
     */
    @JsonProperty("u_level")
    public String getULevel() {
        return uLevel;
    }

    /**
     * @param uLevel The u_level
     */
    @JsonProperty("u_level")
    public void setULevel(String uLevel) {
        this.uLevel = uLevel;
    }

    /**
     * @return The uBusinessDomain
     */
    @JsonProperty("u_business_domain")
    public String getUBusinessDomain() {
        return uBusinessDomain;
    }

    /**
     * @param uBusinessDomain The u_business_domain
     */
    @JsonProperty("u_business_domain")
    public void setUBusinessDomain(String uBusinessDomain) {
        this.uBusinessDomain = uBusinessDomain;
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