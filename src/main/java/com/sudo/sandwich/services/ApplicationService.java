package com.sudo.sandwich.services;

import com.sudo.sandwich.json.domain.Application;

import java.util.Collection;

/**
 * Created by satishterala on 12/21/15.
 */
public interface ApplicationService {

    public Application getApplication(String applId);

    Collection<Application> findAllApplications();

    public Collection<Application> getApplicationForBusinessUnit(String businessUnit);

    Application getApplicationBySupportGroup(String supportGrp);

}
