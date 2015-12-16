package com.sudo.sandwich.repository;

import com.sudo.sandwich.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by satishterala on 12/15/15.
 */
@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>, QueryDslPredicateExecutor<Application> {
}
