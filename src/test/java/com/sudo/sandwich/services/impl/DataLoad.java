package com.sudo.sandwich.services.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sudo.sandwich.HackathonApplication;
import com.sudo.sandwich.json.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by satishterala on 12/21/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HackathonApplication.class)
public class DataLoad {

    @Inject
    MongoTemplate mongoTemplate;

    @Test
    public void insertGroups() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<Group> groups = objectMapper.readValue(new File("/Users/satishterala/Work/WMC/sudo_make_me_sandwich/hackathon/cl-users-grp.json"), new TypeReference<List<Group>>() {
            });
            mongoTemplate.insertAll(groups);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void insertUsers() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<User> users = objectMapper.readValue(new File("/Users/satishterala/Work/WMC/sudo_make_me_sandwich/hackathon/cl-users.json"), new TypeReference<List<User>>() {
            });
            mongoTemplate.insertAll(users);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertGroupMembers() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<GroupMember> grpmembers = objectMapper.readValue(new File("/Users/satishterala/Work/WMC/sudo_make_me_sandwich/hackathon/cl-grmmember.json"), new TypeReference<List<GroupMember>>() {
            });
            mongoTemplate.insertAll(grpmembers);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertApps() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<Application> apps = objectMapper.readValue(new File("/Users/satishterala/Work/WMC/sudo_make_me_sandwich/hackathon/cl-apps.json"), new TypeReference<List<Application>>() {
            });
            mongoTemplate.insertAll(apps);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertApp2App() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<App2App> apps = objectMapper.readValue(new File("/Users/satishterala/Work/WMC/sudo_make_me_sandwich/hackathon/cl-app2app.json"), new TypeReference<List<App2App>>() {
            });
            mongoTemplate.insertAll(apps);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
