package com.sudo.sandwich.repository;

import com.sudo.sandwich.json.domain.GroupMember;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by satishterala on 12/21/15.
 */
public interface GroupMemberRepository extends MongoRepository<GroupMember,String>,QueryDslPredicateExecutor<GroupMember>{
}
