package com.sudo.sandwich.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by satishterala on 12/15/15.
 */
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "INCIDENT_LOG_ID"))
})
@Entity
@Data
public class IncidentLog extends AbstractAuditable<IncidentLog, Long> {

    @ManyToOne(optional = false)
    @JoinColumn(name = "leafBenchmark", referencedColumnName = "INCIDENT_ID")
    Incident incident;

    LocalDateTime loggedAt;


}
