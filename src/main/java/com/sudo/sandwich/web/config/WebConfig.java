package com.sudo.sandwich.web.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * Created by satishterala on 12/21/15.
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //registry.addResourceHandler("/bower_components/**").addResourceLocations("classpath:static/bower_components/");
        //super.addResourceHandlers(registry);

        String staticDir = "static";
        String prefix = "classpath:";
        registry.addResourceHandler("/app/**").addResourceLocations(prefix + staticDir + "/app/");
        registry.addResourceHandler("/assets/**").addResourceLocations(prefix + staticDir + "/assets/");
        registry.addResourceHandler("/bower_components/**").addResourceLocations(prefix + staticDir + "/bower_components/");
        registry.addResourceHandler("index.html").addResourceLocations(prefix + staticDir + "/index.html");
    }
}
