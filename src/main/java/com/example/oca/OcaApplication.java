package com.example.oca;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableJpaRepositories
@EnableKafka
public class OcaApplication {
    public static void main(String[] args) {
        SpringApplication.run(OcaApplication.class, args);
    }
}


