package com.sudo.sandwich.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by satishterala on 12/18/15.
 */
@Entity
@Table(name = "TEAM", uniqueConstraints = {@UniqueConstraint(name = "UK_TEAM_CODE", columnNames = "TEAM_CODE")})
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverrides({@AttributeOverride(name = "id",column = @Column(name = "TEAM_ID"))})
@Data
@EqualsAndHashCode(callSuper=false)
public class Team extends AbstractPersistable<Long> {

    @Column(name = "TEAM_CODE")
    String teamCode;

    @NotNull
    @Enumerated(EnumType.STRING)
    TeamType teamType;



}
