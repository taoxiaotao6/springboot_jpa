package com.taoj.controller;

import com.taoj.entity.Happiness;
import com.taoj.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello spring boot jpa";
    }

    @RequestMapping("/getHappiness")
    @ResponseBody
    public String getHappiness(){
        Happiness happiness = userInfoRepository.findHappinessById(1001);
        System.out.println(happiness.toString());
        return happiness.toString();
    }

}
