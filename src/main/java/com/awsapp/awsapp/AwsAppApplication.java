package com.awsapp.awsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * root of an application
 **/
@SpringBootApplication
public class AwsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsAppApplication.class, args);
        System.out.println("Spring boot deployed to AWS.");
    }

}
