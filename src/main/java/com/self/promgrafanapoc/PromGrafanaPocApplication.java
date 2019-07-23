package com.self.promgrafanapoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromGrafanaPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromGrafanaPocApplication.class, args);
        //ConfigurableApplicationContext ctx = SpringApplication.run(PromGrafanaPocApplication.class, args);
		//SchedulerComponent schedulerComponent = ctx.getBean(SchedulerComponent.class);
    }

}
