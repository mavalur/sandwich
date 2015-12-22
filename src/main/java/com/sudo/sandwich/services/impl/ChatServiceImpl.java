package com.sudo.sandwich.services.impl;

import com.sudo.sandwich.json.domain.ChatStatement;
import com.sudo.sandwich.json.domain.Incident;
import com.sudo.sandwich.json.domain.User;
import com.sudo.sandwich.repository.ChatStatementRepository;
import com.sudo.sandwich.services.ChatService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by satishterala on 12/21/15.
 */
@Service
public class ChatServiceImpl implements ChatService {

    @Inject
    ChatStatementRepository chatStatementRepository;

    @Override
    public void addChatEntryFor(Incident incident, User user, String statement) {
        ChatStatement chatStatement = new ChatStatement();
        chatStatement.setIncidentID(incident.getId());
        chatStatement.setStatement(statement);
        chatStatement.setTimestamp(LocalDateTime.now());
        chatStatement.setUser(user.getUserName());
        chatStatementRepository.save(chatStatement);
    }

    @Override
    public List<ChatStatement> findAllStatementsTaggedWith(String tag) {
        return null;
    }
}
