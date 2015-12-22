package com.sudo.sandwich.web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class ShareController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    UserService userService;

    @RequestMapping("/screenshare")
    public
    @ResponseBody
    JsonNode shareScreen(String ntid) {
    	logger.info("Screen share presenter : " + ntid);
		URL url;
		try {
			url = new URL("https://api.screenleap.com/v2/screen-shares");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("accountid", "sudo_make_me_a_sandwich");
			conn.setRequestProperty("authtoken", "HkAOpmLHQb");
			conn.connect();
		
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder buf = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null)
				buf.append(line);
			
			rd.close();
			JsonNode json= new ObjectMapper().readTree(buf.toString()); 
			 
			return json;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return null;
		}
    }
}
