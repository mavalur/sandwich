package com.sudo.sandwich.services.impl;

import com.twitter.Extractor;
import org.junit.Test;

import java.util.List;

/**
 * Created by satishterala on 12/22/15.
 */
public class ChatStatementTest {

    String text ="Issue has been resolved #Resolved #AddtoSummary";
    Extractor extractor = new Extractor();

    @Test
    public void test(){
        List<String> hashtags = extractor.extractHashtags(text);
        hashtags.stream().forEach(System.out::println);
    }

}
