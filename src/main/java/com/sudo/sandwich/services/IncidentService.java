package com.sudo.sandwich.services;

/**
 * Created by Zuber on 12/21/15.
 */
public interface IncidentService {


    public void updateWorkSummary(String incidentId, String workSummary, boolean append);

    public void assignOwner(String incidentId, String userId);

    public void updateStatus(String incidentId, String status);

}
