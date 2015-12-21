package com.sudo.sandwich.services.impl;

import com.sudo.sandwich.json.domain.User;
import com.sudo.sandwich.repository.UserRepository;
import com.sudo.sandwich.services.UserService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by satishterala on 12/21/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;

    @Override
    public String getMobileNumberFor(String userId) {
        return userRepository.findByUserName(userId).getMobilePhone();
    }

    @Override
    public String getAvayaExtension(String userId) {
        return userRepository.findByUserName(userId).getUAvayaExtension();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findByUserName(userId);
    }
}
