package com.example.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public abstract class Coach {
    
    public abstract String getDailyWorkout();

    @PostConstruct
    public void initStuff() {
        System.out.println("class post construct: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void destroyStuff() {
        System.out.println("class pre destroy: " + getClass().getSimpleName());
    }
}
