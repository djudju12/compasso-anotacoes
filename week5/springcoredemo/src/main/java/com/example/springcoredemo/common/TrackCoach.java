package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach extends Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice track for 15 minutes!!!";
    }
    
}
