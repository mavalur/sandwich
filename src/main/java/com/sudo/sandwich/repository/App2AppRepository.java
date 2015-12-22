package com.sudo.sandwich.repository;

import com.sudo.sandwich.json.domain.App2App;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by satishterala on 12/21/15.
 */
@Repository
public interface App2AppRepository extends MongoRepository<App2App,String>,QueryDslPredicateExecutor<App2App>{
}
