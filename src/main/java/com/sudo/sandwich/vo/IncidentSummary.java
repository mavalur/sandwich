package com.sudo.sandwich.vo;

import com.sudo.sandwich.domain.IncidentStatus;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by satishterala on 12/18/15.
 */
@Value
public class IncidentSummary {

    private Long incidentId;

    private List<String> incidentSummaryNotes;

    private IncidentStatus incidentStatus;

    private LocalDateTime startedAt;

}
