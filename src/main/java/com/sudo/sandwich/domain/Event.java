package com.sudo.sandwich.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by satishterala on 12/18/15.
 */
@Entity
@Table
@Data
public class Event extends AbstractPersistable<UUID> {

    String applicationCode;

    LocalDateTime timeOfOccurence;

    String eventDescription;

    String eventExceptionMessage;


    @NotNull
    @Enumerated(EnumType.STRING)
    EventSeverityLevel eventSeverityLevel;

}
