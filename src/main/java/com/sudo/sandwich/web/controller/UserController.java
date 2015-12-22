package com.sudo.sandwich.web.controller;

import com.sudo.sandwich.json.domain.User;
import com.sudo.sandwich.services.OnCallService;
import com.sudo.sandwich.services.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

/**
 * User
 * Created by satishterala on 12/21/15.
 */
@RestController
public class UserController {


    Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    OnCallService onCallService;


    @Inject
    UserService userService;

    @RequestMapping("/sudo/user/{userId}")
    public
    @ResponseBody
    User getUser(@PathVariable("userId") String userId) {
        User user = userService.getUser(userId);
        logger.info("User {}", user);
        return user;
    }

    @RequestMapping(value = "/sudo/user/mobile/{userId}")
    public
    @ResponseBody
    String getMobileNumberFor(@PathVariable("userId") String userId) {
        User user = userService.getUser(userId);
        logger.info("Mobile # {}", user == null ? "" : user.getMobilePhone());
        return user == null ? "" : user.getMobilePhone();
    }

    @RequestMapping("/onCall")
    public ModelAndView getOnCallUsers(@PathVariable String groupId) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("users", onCallService.getOnCallUser(groupId));
        return mv;
    }
}
