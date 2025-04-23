package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class PublishingSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(PublishingSystemApplication.class, args);
    }


}
