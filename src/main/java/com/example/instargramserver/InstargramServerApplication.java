package com.example.instargramserver;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstargramServerApplication {

    @Value("${aws.access-key:NOT_SET}")
    private String awsAccessKey;

    @Value("${aws.secret-key:NOT_SET}")
    private String awsSecretKey;

    @Value("${db.name:NOT_SET}")
    private String dbName;

    @Value("${db.password:NOT_SET}")
    private String dbPassword;

    public static void main(String[] args) {
        SpringApplication.run(InstargramServerApplication.class, args);
    }

    @PostConstruct
    public void logProperties() {
        System.out.println("====== Application Properties ======");
        System.out.println("AWS Access Key: " + awsAccessKey);
        System.out.println("AWS Secret Key: " + awsSecretKey);
        System.out.println("DB Name: " + dbName);
        System.out.println("DB Password: " + dbPassword);
        System.out.println("=====================================");
    }
}
