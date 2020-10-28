package org.byron4j;

import org.byron4j.bean.AcmePropertiesWithConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AcmePropertiesWithConstructor.class})
public class BindPropertySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BindPropertySpringBootApplication.class, args);
    }
}
