package com.sudo.sandwich.services;

import com.sudo.sandwich.json.domain.Incident;

import java.util.Collection;

/**
 * Created by Zuber on 12/21/15.
 */
public interface IncidentService {


    void updateWorkSummary(String incidentId, String workSummary, boolean append);

    void assignOwner(String incidentId, String userId);

    void updateStatus(String incidentId, String status);

    Collection<Incident> getIncidentsByUser(String userId);

}
