package com.hainet.spring.boot.enable.https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootEnableHttpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEnableHttpsApplication.class, args);
    }

    // curl https://localhost/me -k
    @GetMapping("/me")
    public String me() {
        return "hainet";
    }
}
