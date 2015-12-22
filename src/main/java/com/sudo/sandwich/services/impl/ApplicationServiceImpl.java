package com.sudo.sandwich.services.impl;

import com.sudo.sandwich.json.domain.Application;
import com.sudo.sandwich.repository.ApplicationRepository;
import com.sudo.sandwich.services.ApplicationService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Collection;
import java.util.List;

/**
 * Created by satishterala on 12/21/15.
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Inject
    ApplicationRepository applicationRepository;

    @Override
    public Application getApplication(String applId) {
        return applicationRepository.findByUWmcAppId(applId);
    }

    @Override
    public Collection<Application> findAllApplications(){
        return applicationRepository.findAll();
    }


    @Override
    public Collection<Application> getApplicationForBusinessUnit(String businessUnit) {
        return applicationRepository.findByUBusinessUnit(businessUnit);
    }
}
