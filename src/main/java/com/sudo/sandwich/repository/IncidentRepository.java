package com.sudo.sandwich.repository;

import com.sudo.sandwich.json.domain.Incident;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by Zuber on 12/21/15.
 */
@Repository
public interface IncidentRepository extends MongoRepository<Incident, String>, QueryDslPredicateExecutor<Incident> {

    Incident findById(String incidentId);

}
