package com.mainiway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigMain {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigMain.class).web(true).run(args);

	}

}
