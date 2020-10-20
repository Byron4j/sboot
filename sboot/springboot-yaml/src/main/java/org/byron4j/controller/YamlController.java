package org.byron4j.controller;

import org.byron4j.config.YamlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YamlController {
    @Autowired
    private YamlConfig yamlConfig;

    @RequestMapping("/hello")
    public String hello(){
        return yamlConfig.toString();
    }
}
