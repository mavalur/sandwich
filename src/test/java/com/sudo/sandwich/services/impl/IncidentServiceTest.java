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
    public void updateOwner() {

        incidentService.assignOwner("INC1234", "SaiyeZ");
    }

    @Test
    public void verify() {

        Incident incident = incidentRepository.findById("INC1234");
        System.out.println(Objects.toString(incident));
    }
}
