package com.sudo.sandwich.web.controller;

import com.sudo.sandwich.json.domain.User;
import com.sudo.sandwich.services.OnCallService;
import com.sudo.sandwich.services.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

/**
 * Created by satishterala on 12/21/15.
 */
@RestController
public class UserController {


    Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    OnCallService onCallService;
    

    @Inject
    UserService userService;
    @RequestMapping("/sudo/user")
    public
    @ResponseBody
    User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }

    @RequestMapping("/onCall")
    public ModelAndView getOnCallUsers(@PathVariable String groupId) {
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("users", onCallService.getOnCallUser(groupId));
    	return mv;
    }
}
