package org.byron4j.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Component
// @ConfigurationProperties 注解可以将配置文件解析且将以prefix的值yaml后面的内容作为属性封装到当前YamlConfig类
@ConfigurationProperties(prefix = "yaml")
public class YamlConfig {
    // 属性名需要和 application.yml 中配置的yaml后面的key一致
    private String str;
    private int num;
    private double dnum;
    private Date birthday;
    private List<String> hobby;
    private Map<String, String> map;

    private List<User> users;


}
