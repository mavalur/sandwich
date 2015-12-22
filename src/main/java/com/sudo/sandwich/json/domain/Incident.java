package com.sudo.sandwich.json.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;

/**
 *
 * Created by satishterala on 12/21/15.
 */
@Document(collection = "incidents")
@Getter
@Setter
public class Incident {
    @Id
    private String id;

    private String incidentSummary;
    // Refers to User.id
    private String ownerId;

    private String bridgeId;
    private String rootCause;
    private String workSummary;
    private LocalDateTime createdOn;
    private LocalDateTime closedOn;


    @Version
    Long version;

    @DBRef
    List<ChatStatement> chatStatements;
}
