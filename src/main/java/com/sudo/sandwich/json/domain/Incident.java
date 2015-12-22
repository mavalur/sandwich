package com.sudo.sandwich.json.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by satishterala on 12/21/15.
 */
@Document(collection = "incidents")
@Data
public class Incident {
    @Version
    Long version;
    @DBRef
    List<ChatStatement> chatStatements;
    @Id
    private String id;
    @JsonProperty("application_id")
    private String applicationId;
    @JsonProperty("summary")
    private String incidentSummary;
    // Refers to User.id
    @JsonProperty("owner_id")
    private String ownerId;
    @JsonProperty("bridge_id")
    private String bridgeId;
    @JsonProperty("rootcause")
    private String rootCause;
    @JsonProperty("work_summary")
    private String workSummary;
    @JsonProperty("created_at")
    private LocalDateTime createdOn;
    @JsonProperty("closed_at")
    private LocalDateTime closedOn;
    @JsonProperty("status")
    private String status;
}
