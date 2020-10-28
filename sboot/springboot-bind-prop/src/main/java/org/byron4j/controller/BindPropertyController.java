package org.byron4j.controller;


import org.byron4j.bean.AcmeProperties;
import org.byron4j.bean.AcmePropertiesWithConstructor;
import org.byron4j.bean.ValidateProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BindPropertyController {

    @Autowired
    AcmeProperties acmeProperties;

    @Autowired
    AcmePropertiesWithConstructor acmePropertiesWithConstructor;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(acmeProperties);
        System.out.println(acmePropertiesWithConstructor);
        return acmeProperties.toString() + "\n" + acmePropertiesWithConstructor.toString();
    }


    @Autowired
    ValidateProperties validateProperties;
    @RequestMapping("/valid")
    public String valid(){
        System.out.println(validateProperties);
        //System.out.println("aaaaaaaaaaaaaaaaaaaaa");
        return validateProperties.toString();
    }
}
