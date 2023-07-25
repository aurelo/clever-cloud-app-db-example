package com.kanezi.clevercloudappdbexample;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "app")
@Log4j2
public class AppProperties {

    String name;
    String description;

    @PostConstruct
    void printAppConfig() {
        log.info("app properties: {}", this);
    }
}
