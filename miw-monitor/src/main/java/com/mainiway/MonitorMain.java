package com.mainiway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.config.EnableAdminServer;

 

@SpringBootApplication
@EnableAdminServer
public class MonitorMain {
	  public static void main(String[] args) {
	        SpringApplication.run(MonitorMain.class, args);
	    }
}
