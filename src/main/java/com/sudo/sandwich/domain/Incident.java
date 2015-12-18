package com.sudo.sandwich.domain;

import com.sudo.sandwich.vo.IncidentSummary;
import com.twitter.Extractor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by satishterala on 12/15/15.
 */

@Entity
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "INCIDENT_ID"))
})
@EqualsAndHashCode(callSuper = false)
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

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "PHONE_NUMBER", joinColumns = {@JoinColumn(name = "APP_USER_ID")})
    private Collection<IncidentLog> incidentLogs = new ArrayList<>();

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime updatedDate;

    @Transient
    Extractor extractor;


    @OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.LAZY, orphanRemoval = true)
    @PrimaryKeyJoinColumn
    Bridge bridge;


    public void addLog(String logStatement, String logUser) {
        List<String> hashtags = extractor.extractHashtags(logStatement);
        IncidentLog incidentLog;
        if (hashtags.contains(getId()))
            incidentLog = new IncidentLog(LocalDateTime.now(), Boolean.TRUE, logStatement, logUser);
        else
            incidentLog = new IncidentLog(LocalDateTime.now(), Boolean.FALSE, logStatement, logUser);
        this.incidentLogs.add(incidentLog);
    }

    public IncidentSummary generateIncidentSummary() {
        return new IncidentSummary(this.getId(), getSummaryNotes(), this.incidentStatus, createdDate);
    }

    private List<String> getSummaryNotes() {
        return incidentLogs.stream().filter(incidentLog -> incidentLog.isHashTagged).map(incidentLog1 -> incidentLog1.getLogStatement()).collect(Collectors.toList());
    }


}
