package com.sudo.sandwich.services.impl;

import com.google.common.base.Joiner;
import com.sudo.sandwich.json.domain.Incident;
import com.sudo.sandwich.repository.IncidentRepository;
import com.sudo.sandwich.services.IncidentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Zuber on 12/22/15.
 */
@Service
public class IncidentServiceImpl implements IncidentService {

    final Joiner JOINER = Joiner.on(" ");
    Logger logger = LoggerFactory.getLogger(getClass());
    @Inject
    IncidentRepository incidentRepository;

    @Override
    public void updateWorkSummary(String incidentId, String workSummary, boolean append) {
        Incident incident = incidentRepository.findById(incidentId);
        if (incident != null) {
            if (append) {
                String existing = incident.getWorkSummary();
                if (existing != null) {
                    workSummary = JOINER.join(existing, workSummary);
                }
            }
            incident.setWorkSummary(workSummary);
            incidentRepository.save(incident);
        } else {
            logger.debug("Empty incident");
        }
    }

    @Override
    public void assignOwner(String incidentId, String userId) {
        Incident incident = incidentRepository.findById(incidentId);
        if (incident != null) {
            incident.setOwnerId(userId);
            incidentRepository.save(incident);
        } else {
            logger.debug("Empty incident");
        }
    }

    @Override
    public void updateStatus(String incidentId, String status) {
        Incident incident = incidentRepository.findById(incidentId);
        if (incident != null) {
            incident.setStatus(status);
            incidentRepository.save(incident);
        } else {
            logger.debug("Empty incident");
        }
    }
}
