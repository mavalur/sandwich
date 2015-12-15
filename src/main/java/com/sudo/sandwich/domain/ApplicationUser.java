package com.sudo.sandwich.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;
import java.util.List;

/**
 * Created by satishterala on 12/15/15.
 */
@Entity
public class ApplicationUser extends AbstractAuditable<ApplicationUser,Long>{

    String userId;

    /** List of applications this user belongs to **/
    List<Application>  applications;


}
