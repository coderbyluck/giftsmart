package org.coder.services.shopper.gifts.user.controller;


import org.coder.services.shopper.gifts.user.domain.User;
import org.coder.services.shopper.gifts.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by coderbyluck on 3/4/17.
 */
@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/saveUser" , method = RequestMethod.PUT)
    public void createUser(@RequestBody User user){
        userService.create(user);
    }

    @RequestMapping(path = "/updateUser" , method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @RequestMapping(path = "/getUser" , method = RequestMethod.GET)
    public @ResponseBody User getUser(@RequestParam String userId){
        return userService.getByUserId(userId);
    }

    @RequestMapping(path = "/getAllUsers" , method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
