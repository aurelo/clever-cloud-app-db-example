package com.kanezi.clevercloudappdbexample;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/")
@Value
public class HomeController {

    AppProperties appProperties;

    @GetMapping
    String welcome() {
        return UUID.randomUUID()
                   .toString();
    }

    @GetMapping("/app")
    AppProperties displayAppProperties() {
        return appProperties;
    }
}
