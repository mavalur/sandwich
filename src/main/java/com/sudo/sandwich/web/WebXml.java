package com.sudo.sandwich.web;

import com.sudo.sandwich.HackathonApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by satishterala on 12/21/15.
 */
@Configuration
public class WebXml extends SpringBootServletInitializer{


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HackathonApplication.class);
    }
}
