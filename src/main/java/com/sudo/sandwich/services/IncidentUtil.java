package com.sudo.sandwich.services;

import com.sudo.sandwich.json.domain.Incident;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Zuber on 12/22/15.
 */
public class IncidentUtil {

    public static IncidentStatus getStatus(Incident incident) {

        String status = incident.getStatus();
        IncidentStatus incidentStatus = IncidentStatus.OPEN;
        if (StringUtils.isNotBlank(status)) {
            incidentStatus = IncidentStatus.valueOf(status);
        }
        return incidentStatus;
    }
}
