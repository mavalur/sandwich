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
        "child",
        "__status",
        "connection_strength",
        "dv_parent",
        "dv_child"
})
@Document(collection = "app2app")
public class App2App {

    @Id
    private String id;

    @TextIndexed
    @JsonProperty("child")
    private String child;
    @JsonProperty("__status")
    private String Status;
    @JsonProperty("connection_strength")
    private String connectionStrength;
    @TextIndexed
    @JsonProperty("dv_parent")
    private String dvParent;
    @TextIndexed
    @JsonProperty("dv_child")
    private String dvChild;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The child
     */
    @JsonProperty("child")
    public String getChild() {
        return child;
    }

    /**
     * @param child The child
     */
    @JsonProperty("child")
    public void setChild(String child) {
        this.child = child;
    }

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
     * @return The connectionStrength
     */
    @JsonProperty("connection_strength")
    public String getConnectionStrength() {
        return connectionStrength;
    }

    /**
     * @param connectionStrength The connection_strength
     */
    @JsonProperty("connection_strength")
    public void setConnectionStrength(String connectionStrength) {
        this.connectionStrength = connectionStrength;
    }

    /**
     * @return The dvParent
     */
    @JsonProperty("dv_parent")
    public String getDvParent() {
        return dvParent;
    }

    /**
     * @param dvParent The dv_parent
     */
    @JsonProperty("dv_parent")
    public void setDvParent(String dvParent) {
        this.dvParent = dvParent;
    }

    /**
     * @return The dvChild
     */
    @JsonProperty("dv_child")
    public String getDvChild() {
        return dvChild;
    }

    /**
     * @param dvChild The dv_child
     */
    @JsonProperty("dv_child")
    public void setDvChild(String dvChild) {
        this.dvChild = dvChild;
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