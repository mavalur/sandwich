package com.sudo.sandwich.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

/**
 * Created by satishterala on 12/15/15.
 */
@Embeddable
@AllArgsConstructor
@Getter
@Setter
public class IncidentLog {

    LocalDateTime loggedAt;

    Boolean isHashTagged;

    String logStatement;

    String user;


}
