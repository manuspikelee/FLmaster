package com.smart.controller;

import com.smart.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by spikelyh on 16/2/29.
 */

@Controller
public class MainController{

    @Autowired
    private UserService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        service.insert();
        System.out.println("控制器");
        return "index";
    }

}
