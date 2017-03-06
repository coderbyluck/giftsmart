package org.coder.services.shopper.gifts.user.service;

import org.coder.services.shopper.gifts.user.domain.User;

import java.util.List;

/**
 * Created by coderbyluck on 3/4/17.
 */
public interface UserService {

    void create(User user);
    User getByUserId(String userId);
    void updateUser(User user);
    void deleteUser(String userId);

    List<User> getAllUsers();
}
