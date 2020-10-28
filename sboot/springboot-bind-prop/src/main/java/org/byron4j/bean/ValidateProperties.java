package org.byron4j.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;


@Data
@Component
@ConfigurationProperties("validate.prop")
@Validated
public class ValidateProperties {

    @NotNull
    private String username;

    @Max(35)
    private int age;

    @Email
    private String email;
}
