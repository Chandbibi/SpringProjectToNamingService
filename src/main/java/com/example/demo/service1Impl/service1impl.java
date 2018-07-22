package com.example.demo.service1Impl;

import com.example.demo.myservice.service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service("service1")
//@Primary
public class service1impl implements service {

    public String meth(){
        return "hi";
    }

}
