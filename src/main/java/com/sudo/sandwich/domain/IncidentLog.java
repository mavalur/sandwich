package com.sudo.sandwich.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by satishterala on 12/15/15.
 */
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "INCIDENT_LOG_ID"))
})
@Entity
@EqualsAndHashCode(callSuper=false)
@Data
public class IncidentLog extends AbstractPersistable<Long> {

    @ManyToOne(optional = false)
    @JoinColumn(name = "leafBenchmark", referencedColumnName = "INCIDENT_ID")
    Incident incident;

    LocalDateTime loggedAt;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime updatedDate;



}
