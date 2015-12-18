package com.sudo.sandwich.domain;

import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by satishterala on 12/18/15.
 */
@Entity
@Table(name = "APP_TEAM")
@PrimaryKeyJoinColumn(name = "TEAM_ID",foreignKey = @ForeignKey(name = "FK_TEAM_CNTR_TEAM"))
@EqualsAndHashCode
public class CentralTeam extends Team{
}
