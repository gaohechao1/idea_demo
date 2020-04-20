package com.example.demo.job;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestQuartzConfig {
    @Bean
    public JobDetail teatQuartzDetail(){
        return JobBuilder.newJob(TestQuartz.class)
                .withIdentity("testQuartz")
                .storeDurably()
                .requestRecovery(true)
                .build();
    }
    @Bean
    public Trigger testQuartzTrigger(){
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("name","ghc");

        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder
                .simpleSchedule()
                .withIntervalInSeconds(3)
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(teatQuartzDetail())
                .withIdentity("testQuartz")
                .withSchedule(simpleScheduleBuilder)
                .usingJobData(jobDataMap)
                .build();
    }
}
