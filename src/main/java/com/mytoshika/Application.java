package com.mytoshika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mytoshika.service.TestService2;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Value("${app.key}")
    private String appKey;
    
    @Autowired
    private TestService2 testService2;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	System.out.println("I am in Main class, appKey = "+appKey);
    	testService2.displayAppKey();
        System.out.println("Hello world!");
    }

}
