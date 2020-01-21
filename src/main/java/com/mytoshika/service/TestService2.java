package com.mytoshika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService2 {

    @Value("${app.key}")
    private String appKey;
    
    @Autowired
    private TestService1 testService;
    
	public void displayAppKey() {
		testService.displayAppKey();
		System.out.println("I am in TestService 2222, appKey = "+appKey);
	}
}
