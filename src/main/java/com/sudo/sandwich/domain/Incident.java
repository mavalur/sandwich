package com.sudo.sandwich.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * Created by satishterala on 12/15/15.
 */

@Entity
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "INCIDENT_ID"))
})
@EqualsAndHashCode(callSuper=false)
public class Incident extends AbstractPersistable<Long> {

    /**
     * The application to which this incident needs to be assigned to
     **/
    @ManyToOne
    @JoinColumn(name = "APP_ID")
    Application application;

    @NotNull
    @Enumerated(EnumType.STRING)
    IncidentStatus incidentStatus;



    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "incident")
    Collection<IncidentLog> incidentLogs;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime updatedDate;



}
