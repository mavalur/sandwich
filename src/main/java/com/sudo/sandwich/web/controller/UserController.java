package com.sudo.sandwich.web.controller;

import com.sudo.sandwich.json.domain.User;
import com.sudo.sandwich.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by satishterala on 12/21/15.
 */
@RestController
public class UserController {


    Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    UserService userService;

    @RequestMapping("/sudo/user")
    public
    @ResponseBody
    User getUser(String userId) {
        return userService.getUser(userId);
    }

}
