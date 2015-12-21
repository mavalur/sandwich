package com.sudo.sandwich.services;

import com.sudo.sandwich.json.domain.User;

/**
 * Created by satishterala on 12/21/15.
 */
public interface UserService {

    public String getMobileNumberFor(String userId);

    public String getAvayaExtension(String userId);

    public User getUser(String userId);
}
