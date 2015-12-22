package com.sudo.sandwich.repository;

import com.sudo.sandwich.json.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by satishterala on 12/21/15.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String>, QueryDslPredicateExecutor<User> {

    User findByUserName(String userId);

}
