package com.mainiway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringCloudApplication
@EnableHystrix
public class HystrixMain {
	public static void main(String[] args) {
		SpringApplication.run(HystrixMain.class, args);
	}
}
