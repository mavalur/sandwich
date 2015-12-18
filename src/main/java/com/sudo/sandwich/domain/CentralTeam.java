package com.sudo.sandwich.domain;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * Created by satishterala on 12/18/15.
 */
@Entity
@Table(name = "CNTRL_TEAM")
@PrimaryKeyJoinColumn(name = "TEAM_ID",foreignKey = @ForeignKey(name = "FK_TEAM_CNTR_TEAM"))
@EqualsAndHashCode
public class CentralTeam extends Team{



    @ManyToMany
    @JoinTable(name = "CNTRL_TEAM_PERSON", joinColumns = {@JoinColumn(name = "APP_ID")}, inverseJoinColumns = {@JoinColumn(name = "APP_USER_ID")})
    @OrderBy("CALL_ORDER ASC")
    private List<Person> persons;

}
