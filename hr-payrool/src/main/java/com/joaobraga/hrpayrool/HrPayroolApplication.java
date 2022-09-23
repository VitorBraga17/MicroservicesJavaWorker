package com.joaobraga.hrpayrool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@RibbonClient(name = "hr-worker")
@SpringBootApplication
public class HrPayroolApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayroolApplication.class, args);
	}

}
