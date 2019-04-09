package com.ldej.zzj.controller;

import com.ldej.zzj.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="test")
public class TestController {

    @PostMapping(value = "/test")
    public String test(String input,int page)
    {
        return new StringBuffer(input).reverse().append(page).toString();
    }
    @PostMapping(value = "/test1")
    public String getUser(@RequestBody User user){
        return new StringBuffer(user.getAge()+"").reverse().append(user.getUsername()).toString();
    }
}
