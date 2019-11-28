package com.qf.conroller;

import com.qf.dao.UserMappeer;
import com.qf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMappeer userMappeer;

    @RequestMapping("/user")
    public List userList(){
        List<User> users = userMappeer.userList();
        return users;
    }
}
