package com.sudo.sandwich.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import java.util.List;

/**
 * Created by satishterala on 12/15/15.
 */
@Table(uniqueConstraints = {@UniqueConstraint(name = "uk_app_name",columnNames = "APP_NAME")})
@Entity
public class Application extends AbstractAuditable<Application,Long>{

    @Column(name = "APP_NAME")
    String applicationName;

    /** Users Responsible for this application **/
    List<ApplicationUser> applicationUsers;

    /** List of incidents assigned to this application **/
    @OneToMany
    List<Incident> incidents;






}
