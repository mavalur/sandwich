package com.sudo.sandwich.repository;

import com.sudo.sandwich.json.domain.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by satishterala on 12/21/15.
 */
@Repository
public interface ApplicationRepository extends MongoRepository<Application,String>{
}
