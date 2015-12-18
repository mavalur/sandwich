package com.sudo.sandwich.domain;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

/**
 * Created by satishterala on 12/18/15.
 */
@Entity
@Table(name = "APP_TEAM")
@PrimaryKeyJoinColumn(name = "TEAM_ID",foreignKey = @ForeignKey(name = "FK_TEAM_APP_TEAM"))
@EqualsAndHashCode
public class ApplicationTeam extends Team{


    @ManyToMany
    @JoinTable(name = "APP_TEAM_PERSON", joinColumns = {@JoinColumn(name = "APP_ID")}, inverseJoinColumns = {@JoinColumn(name = "APP_USER_ID")})
    @OrderBy("CALL_ORDER ASC")
    private List<Person> persons;


    @OneToMany
    Collection<Application> applications;





}
