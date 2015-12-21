package com.sudo.sandwich.json.domain;

import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Created by satishterala on 12/21/15.
 */
@Document
public class ChatStatement {

    String user;
    String statement;
    LocalDateTime timestamp;
    @Version
    Long version;


}
