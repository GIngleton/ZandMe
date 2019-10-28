package com.revature.screenforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.*;


@EnableFeignClients(basePackages = {"com.revature.client",
		"com.revature.controllers" })
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.revature.feign"})
public class ScreeningReportServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ScreeningReportServiceApplication.class, args);
	}

}

