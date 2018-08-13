package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/customer")
    public  Customer customer(){
        Customer customer = new Customer(1,"Anna Andersson", "Kungsgatan 12",
                11613, "Stockholm","heje@heje.com");
        return customer;
    }
}
