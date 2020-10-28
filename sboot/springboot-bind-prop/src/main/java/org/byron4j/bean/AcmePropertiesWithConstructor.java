package org.byron4j.bean;

import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.List;


@ToString
@ConstructorBinding
@ConfigurationProperties("acmec")
public class AcmePropertiesWithConstructor {
    private boolean enabled;

    private InetAddress remoteAddress;

    private Security security;

    public AcmePropertiesWithConstructor(boolean enabled, InetAddress remoteAddress, @DefaultValue Security security) {
        this.enabled = enabled;
        this.remoteAddress = remoteAddress;
        this.security = security;
    }

    @ToString
    public static class Security {

        private final String username;

        private final String password;

        private final List<String> roles;

        public Security(String username, String password,
                        @DefaultValue("USER") List<String> roles) {
            this.username = username;
            this.password = password;
            this.roles = roles;
        }
    }
}
