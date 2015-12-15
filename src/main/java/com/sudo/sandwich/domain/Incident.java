package com.sudo.sandwich.domain;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by satishterala on 12/15/15.
 */
@Entity

@Data
public class Incident extends AbstractAuditable<Incident,Long>{

    /**The application to which this incident needs to be assigned to **/
    @ManyToOne
    Application application;

    @NotNull
    @Enumerated(EnumType.STRING)
    IncidentStatus incidentStatus;


}
