package io.org.tomay.rest;

import io.org.tomay.entity.User;
import io.org.tomay.service.UserServiceData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioRest {

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<User> getUsers(){
        List<User> users= UserServiceData.getAllUsers();
        return users;

    }
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public User newUser(@RequestBody @Valid User user){
        User u= user;
        return u;
    }
}
