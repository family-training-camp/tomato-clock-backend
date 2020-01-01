package com.tomatoclock.taskserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TaskServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaskServerApplication.class, args);
  }
}
