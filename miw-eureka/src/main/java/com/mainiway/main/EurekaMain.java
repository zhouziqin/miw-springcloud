package com.mainiway.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册服务中心
 * @author zzq
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain { 

	    public static void main(String[] args) {
	        new SpringApplicationBuilder(EurekaMain.class)
	                    .web(true).run(args);
	    }
	 
}
