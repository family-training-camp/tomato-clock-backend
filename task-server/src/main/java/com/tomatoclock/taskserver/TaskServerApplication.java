package com.tomatoclock.taskserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableDiscoveryClient
public class TaskServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaskServerApplication.class, args);
  }
}
