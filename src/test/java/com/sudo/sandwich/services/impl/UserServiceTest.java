package com.sudo.sandwich.services.impl;

import com.sudo.sandwich.HackathonApplication;
import com.sudo.sandwich.json.domain.User;
import com.sudo.sandwich.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by satishterala on 12/21/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HackathonApplication.class)
@PropertySource("application.properties")
public class UserServiceTest {

    @Inject
    MongoTemplate mongoTemplate;


    @Inject
    UserService userService;

    @Test
    public void testUserRetrievalByUserName(){
        User teralS = userService.getUser("TeralS");
        System.out.println("teralS = " + teralS);
    }

}
