package com.sudo.sandwich.json.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

/**
 * Created by satishterala on 12/21/15.
 */
@Document
public class Incident {
    @Id
    private String id;


    Collection<ChatStatement> chatStatements;
}
