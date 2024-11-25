package com.example.spring_boot_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {
 @Autowired
 private Dog dog; // Dependency Injection
 @GetMapping("/ok")
 public  String okay(){
  return  dog.fun();
 }
}
