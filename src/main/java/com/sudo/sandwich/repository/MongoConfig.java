package com.sudo.sandwich.repository;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by satishterala on 12/21/15.
 */
@EnableMongoRepositories
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "sandwich";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(new MongoClientURI("mongodb://sandwich:sandwich@ds035385.mongolab.com:35385/sandwich"));
    }


}
