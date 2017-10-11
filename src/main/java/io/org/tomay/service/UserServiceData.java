package io.org.tomay.service;

import io.org.tomay.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fidelvillanuevadelgado on 10/10/17.
 */
public class UserServiceData {
    public static List<User> getAllUsers(){
        List<User> users=new ArrayList<>();
        User user=new User();
        user.setName("Pitter");
        user.setLastName("Vega Rarmet");
        user.setEmail("vega@iclou.com");
        user.setAge(23);
        users.add(user);
        return users;
    }
}
