package com.example.demo;

import com.spring4all.mongodb.EnableMongoPlus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongoPlus
public class MongodbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbDemoApplication.class, args);
    }

}
