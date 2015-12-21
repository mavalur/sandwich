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
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "__status",
        "group",
        "sys_id",
        "user"
})
@Document(collection = "grp_members")
public class GroupMember {

    @Id
    private String id;


    @JsonProperty("__status")
    private String Status;
    @TextIndexed
    @JsonProperty("group")
    private String group;
    @JsonProperty("sys_id")
    private String sysId;
    @TextIndexed
    @JsonProperty("user")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The Status
     */
    @JsonProperty("__status")
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status The __status
     */
    @JsonProperty("__status")
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return The group
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * @param group The group
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
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
     * @return The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
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
