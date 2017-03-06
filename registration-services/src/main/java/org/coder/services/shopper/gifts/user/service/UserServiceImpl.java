package org.coder.services.shopper.gifts.user.service;

import com.google.common.collect.Lists;
import org.coder.services.shopper.gifts.user.domain.User;
import org.coder.services.shopper.gifts.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by coderbyluck on 3/4/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public User getByUserId(String userId) {
        return userRepository.findOne(userId);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.delete(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }
}
