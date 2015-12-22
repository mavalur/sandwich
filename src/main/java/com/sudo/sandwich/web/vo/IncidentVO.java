package com.sudo.sandwich.web.vo;

import com.sudo.sandwich.json.domain.Incident;

import java.util.Collection;

/**
 * Created by satishterala on 12/22/15.
 */
public class IncidentVO {

    public int openIssues;

    public int overDueIssues;

    public int noOfIssues;

    Collection<Incident> incidents;


}
