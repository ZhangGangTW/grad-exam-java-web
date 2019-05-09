package com.thoughtworks.exam.java.web.service;

import com.thoughtworks.exam.java.web.model.User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

@Service
public class UserService {

    public User getUserById(String id) {
        final User user = new User();
        user.setId(id);
        user.setUsername("James");
        user.setAge(28);
        user.setEmail("james@gmail.com");
        user.setMobile("18825678888");
        return user;
    }

    public User addUser(User user) {
        user.setId(UUID.randomUUID().toString());
        return user;
    }

    public boolean deleteUserById(String id) {
        return !StringUtils.isEmpty(id);
    }
}
