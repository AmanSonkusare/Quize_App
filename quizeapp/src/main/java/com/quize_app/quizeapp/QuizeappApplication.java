package com.quize_app.quizeapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Slf4j

public class QuizeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizeappApplication.class, args);
    }

}
