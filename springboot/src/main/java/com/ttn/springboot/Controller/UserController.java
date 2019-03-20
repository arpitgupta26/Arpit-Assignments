package com.ttn.springboot.Controller;

import com.ttn.springboot.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    User user;
    
    
    @GetMapping("/getUser")
    @ResponseBody
    public User getUser(){
        user.setUsername("Arpit");
        user.setPassword("1234");
        return user;
    }
    
}
