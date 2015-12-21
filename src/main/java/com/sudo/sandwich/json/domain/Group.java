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
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "sys_id",
        "u_itil_group",
        "active",
        "u_administrator",
        "description",
        "email",
        "manager",
        "parent",
        "type",
        "u_mini_cab"
})
@Document(collection = "groups")
public class Group {

    @JsonProperty("sys_id")
    private String sysId;
    @JsonProperty("u_itil_group")
    private String uItilGroup;
    @JsonProperty("active")
    private String active;
    @JsonProperty("u_administrator")
    private String uAdministrator;
    @JsonProperty("description")
    private String description;
    @JsonProperty("email")
    private String email;
    @JsonProperty("manager")
    private String manager;
    @JsonProperty("parent")
    private String parent;
    @JsonProperty("type")
    private String type;
    @JsonProperty("u_mini_cab")
    private String uMiniCab;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The sysId
     */
    @JsonProperty("sys_id")
    public String getSysId() {
        return sysId;
    }

    /**
     *
     * @param sysId
     * The sys_id
     */
    @JsonProperty("sys_id")
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     *
     * @return
     * The uItilGroup
     */
    @JsonProperty("u_itil_group")
    public String getUItilGroup() {
        return uItilGroup;
    }

    /**
     *
     * @param uItilGroup
     * The u_itil_group
     */
    @JsonProperty("u_itil_group")
    public void setUItilGroup(String uItilGroup) {
        this.uItilGroup = uItilGroup;
    }

    /**
     *
     * @return
     * The active
     */
    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    /**
     *
     * @param active
     * The active
     */
    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    /**
     *
     * @return
     * The uAdministrator
     */
    @JsonProperty("u_administrator")
    public String getUAdministrator() {
        return uAdministrator;
    }

    /**
     *
     * @param uAdministrator
     * The u_administrator
     */
    @JsonProperty("u_administrator")
    public void setUAdministrator(String uAdministrator) {
        this.uAdministrator = uAdministrator;
    }

    /**
     *
     * @return
     * The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The manager
     */
    @JsonProperty("manager")
    public String getManager() {
        return manager;
    }

    /**
     *
     * @param manager
     * The manager
     */
    @JsonProperty("manager")
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     *
     * @return
     * The parent
     */
    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    /**
     *
     * @param parent
     * The parent
     */
    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The uMiniCab
     */
    @JsonProperty("u_mini_cab")
    public String getUMiniCab() {
        return uMiniCab;
    }

    /**
     *
     * @param uMiniCab
     * The u_mini_cab
     */
    @JsonProperty("u_mini_cab")
    public void setUMiniCab(String uMiniCab) {
        this.uMiniCab = uMiniCab;
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