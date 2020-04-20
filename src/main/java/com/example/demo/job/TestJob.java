package com.example.demo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestJob {
    @Scheduled(cron = "0/2 * * * * *")
    public  void  job(){
        System.out.println("gaohechao is cool");
    }
}
