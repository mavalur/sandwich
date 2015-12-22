package com.sudo.sandwich.services.impl;

import com.sudo.sandwich.HackathonApplication;
import com.sudo.sandwich.json.domain.Incident;
import com.sudo.sandwich.repository.IncidentRepository;
import com.sudo.sandwich.services.IncidentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by Zuber on 12/21/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HackathonApplication.class)
@PropertySource("application.properties")
public class IncidentServiceTest {

    @Inject
    MongoTemplate mongoTemplate;


    @Inject
    IncidentService incidentService;

    @Inject
    IncidentRepository incidentRepository;

    @Test
    public void insertIncident() {

        Incident incident = new Incident();
        incident.setId("INC1234");
        incidentRepository.insert(incident);
    }

    @Test
    public void insertIncidents() {

        Incident incident = new Incident();
        incident.setId("INC1000");
        incident.setStatus("CLOSED");
        incident.setOwnerId("SaiyeZ");
        incident.setWorkSummary("The system is impact due to ongoing network outage");
        incident.setApplicationId("PC");
        incident.setCreatedOn(LocalDateTime.now());
        incident.setClosedOn(LocalDateTime.now());
        incident.setRootCause("Network outage");
        incident.setIncidentSummary("Exception occurred while saving the records");
        incidentRepository.insert(incident);

        incident = new Incident();
        incident.setId("INC1001");
        incident.setStatus("CLOSED");
        incident.setOwnerId("SaiyeZ");
        incident.setWorkSummary("The system is impact due to ongoing network outage");
        incident.setApplicationId("PM");
        incident.setCreatedOn(LocalDateTime.now());
        incident.setClosedOn(LocalDateTime.now());
        incident.setRootCause("Network outage");
        incident.setIncidentSummary("Exception occurred while saving the records");
        incidentRepository.insert(incident);

        incident = new Incident();
        incident.setId("INC1002");
        incident.setStatus("CLOSED");
        incident.setOwnerId("SaiyeZ");
        incident.setWorkSummary("The system is impact due to ongoing network outage");
        incident.setApplicationId("PL");
        incident.setCreatedOn(LocalDateTime.now());
        incident.setClosedOn(LocalDateTime.now());
        incident.setRootCause("Network outage");
        incident.setIncidentSummary("Exception occurred while saving the records");
        incidentRepository.insert(incident);

        incident = new Incident();
        incident.setId("INC1003");
        incident.setStatus("OPEN");
        incident.setOwnerId("SaiyeZ");
        incident.setApplicationId("CASH");
        incident.setCreatedOn(LocalDateTime.now());
        incident.setClosedOn(LocalDateTime.now());
        incident.setIncidentSummary("org.springframework.boot.ResourceException: .... ");
        incidentRepository.insert(incident);

        incident = new Incident();
        incident.setId("INC1004");
        incident.setStatus("OPEN");
        incident.setOwnerId("SaiyeZ");
        incident.setApplicationId("FI");
        incident.setCreatedOn(LocalDateTime.now());
        incident.setClosedOn(LocalDateTime.now());
        incident.setIncidentSummary("Spring Framework Exception");
        incidentRepository.insert(incident);
    }

    @Test
    public void updateOwner() {

        incidentService.assignOwner("INC1234", "SaiyeZ");
    }

    @Test
    public void updateStatus() {

        incidentService.updateStatus("INC1234", "OPEN");
    }

    @Test
    public void verify() {

        Incident incident = incidentRepository.findById("INC1234");
        System.out.println(Objects.toString(incident));
    }
}
