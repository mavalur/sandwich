package com.sudo.sandwich.services;

import com.sudo.sandwich.json.domain.ChatStatement;
import com.sudo.sandwich.json.domain.Incident;
import com.sudo.sandwich.json.domain.User;

import java.util.Collection;
import java.util.List;

/**
 * Created by satishterala on 12/21/15.
 */
public interface ChatService {

    public void addChatEntryFor(Incident incident, User user,String statement);

    public List<ChatStatement> findAllStatementsTaggedWith(String tag);

}
