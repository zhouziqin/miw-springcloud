package com.mainiway.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供者
 * @author zzq
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ServiceMain {
	
	public static void main(String[] args) {
		  new SpringApplicationBuilder(
				  ServiceMain.class)
		            .web(true).run(args); 
	}
	 	@Autowired
	    DiscoveryClient discoveryClient;
	 	/**
	 	 * 获取所有服务清单
	 	 * @return
	 	 */
	    @GetMapping("/dc")
	    public String dc() {
	        String services = "Services: " + discoveryClient.getServices();
	        System.out.println(services);
	        return services;
	    }
	    @GetMapping("/dc2")
	    public String dc2() {
	        String services = "Services2: " + discoveryClient.getServices();
	        try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println(services);
	        return services;
	    }
}
