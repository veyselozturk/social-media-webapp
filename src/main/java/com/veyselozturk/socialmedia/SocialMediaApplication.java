package com.veyselozturk.socialmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // Bu sinifi haric tut.
public class SocialMediaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialMediaApplication.class, args);
    }

}
