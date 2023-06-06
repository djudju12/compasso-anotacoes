package com.example.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springcoredemo.common.BaseballCoach;
import com.example.springcoredemo.common.Coach;
import com.example.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean
    Coach swimCoach(){
        return new SwimCoach();
    }
    @Bean
    Coach baseballCoach(){
        return new BaseballCoach();
    }

}
