package com.sudo.sandwich.repository;

import com.sudo.sandwich.json.domain.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by satishterala on 12/21/15.
 */
@Repository
public interface ApplicationRepository extends MongoRepository<Application, String>, QueryDslPredicateExecutor<Application> {

    Application findByUWmcAppId(String applId);

    Collection<Application> findByUBusinessUnit(String businessUnit);
}
