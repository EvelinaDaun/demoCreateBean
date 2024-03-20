package com.example.demoCreateBean;

import org.springframework.stereotype.Component;

@Component
public class Hello implements HelloInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
