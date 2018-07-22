package com.example.demo.mycontroller;

import com.example.demo.myservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    service service2;

    @GetMapping
    public String meth(){
        return service2.meth();
    }
}
