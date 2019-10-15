package com.example.Item;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.omg.CORBA.Object;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }


   /* @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }*/

}
