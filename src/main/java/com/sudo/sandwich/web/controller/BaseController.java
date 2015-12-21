package com.sudo.sandwich.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by satishterala on 12/21/15.
 */
@Controller
public class BaseController {

    @RequestMapping("/")
    String home(){
        return "index";
    }




}
