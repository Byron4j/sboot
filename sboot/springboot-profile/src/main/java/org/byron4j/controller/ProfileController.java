package org.byron4j.controller;


import org.byron4j.bean.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    AcmeProperties acmeProperties;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(acmeProperties);
        return acmeProperties.toString() ;
    }
}
