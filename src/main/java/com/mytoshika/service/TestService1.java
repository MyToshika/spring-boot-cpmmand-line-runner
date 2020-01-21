package com.mytoshika.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService1 {

    @Value("${app.key}")
    private String appKey;
    
	public void displayAppKey() {
		System.out.println("I am in TestService 1111, appKey = "+appKey);
	}
}
