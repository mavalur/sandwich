package com.sudo.sandwich.repository;

import com.sudo.sandwich.domain.ApplicationTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by satishterala on 12/18/15.
 */
public interface ApplicationTeamRepository extends JpaRepository<ApplicationTeam, Long>, QueryDslPredicateExecutor<ApplicationTeam> {

    public ApplicationTeam findByTeamCode(String teamCode);
}
