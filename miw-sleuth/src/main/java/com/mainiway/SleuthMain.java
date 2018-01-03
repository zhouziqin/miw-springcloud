package com.mainiway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthMain {
	  public static void main(String[] args) {
	        SpringApplication.run(SleuthMain.class, args);
	    }
}
