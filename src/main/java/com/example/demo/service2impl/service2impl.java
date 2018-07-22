package com.example.demo.service2impl;

import com.example.demo.myservice.service;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service("service2")
public class service2impl implements service {

    public String meth(){
        return "hello";
    }
}
