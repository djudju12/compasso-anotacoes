package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TenisCoach extends Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice tenis for 15 minutes!!!";
    }
    
}
