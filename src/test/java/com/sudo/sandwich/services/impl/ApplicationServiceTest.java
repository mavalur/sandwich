package com.sudo.sandwich.services.impl;

import com.sudo.sandwich.HackathonApplication;
import com.sudo.sandwich.json.domain.Application;
import com.sudo.sandwich.services.ApplicationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by satishterala on 12/21/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HackathonApplication.class)
public class ApplicationServiceTest {

    @Inject
    ApplicationService applicationService;

    @Test
    public void testRetrieveAllApplications(){
        Collection<Application> allApplications = applicationService.findAllApplications();
        List<String> businessDomains = allApplications.stream().map(application -> application.getUBusinessDomain()).collect(Collectors.toList());
        System.out.println("businessDomains = " + businessDomains);
    }

}
