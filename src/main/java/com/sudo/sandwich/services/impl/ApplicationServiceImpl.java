package com.sudo.sandwich.services.impl;

import com.sudo.sandwich.domain.Application;
import com.sudo.sandwich.domain.ApplicationTeam;
import com.sudo.sandwich.repository.ApplicationRepository;
import com.sudo.sandwich.repository.ApplicationTeamRepository;
import com.sudo.sandwich.services.ApplicationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.time.LocalDateTime;

/**
 * Created by satishterala on 12/15/15.
 */
@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Inject
    ApplicationRepository applicationRepository;

    @Inject
    ApplicationTeamRepository applicationTeamRepository;

    @Override
    @Transactional
    public Application addApplication(String applicationCode, String applicationName) {
        Application application = new Application();
        application.setApplicationCode(applicationCode);
        application.setApplicationName(applicationName);
        application.setCreatedDate(LocalDateTime.now());
        return applicationRepository.save(application);
    }



    @Transactional
    public void setupApplicationTeamForApplication(String teamCode,String applicationCode){
        ApplicationTeam applicationTeam = applicationTeamRepository.findByTeamCode(teamCode);
        Application application = applicationRepository.findByApplicationCode(applicationCode);
        application.setApplicationTeam(applicationTeam);
    }
}
