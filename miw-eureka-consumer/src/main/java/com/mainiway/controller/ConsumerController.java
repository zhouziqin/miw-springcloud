package com.mainiway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
 public class ConsumerController {
		/**
		 * 
		 * dc 使用的是eureka 的负载中心
		 * dc2 使用ribbon
		 * dc3 使用 feign 
		 */
	 /*   @Autowired
	    LoadBalancerClient loadBalancerClient;*/
/*	    @Autowired
	    RestTemplate restTemplate;*/
	    @Autowired
	    ConsumerService consumerService;
	  /*  @GetMapping("/consumer")
	    public String dc() {
	        ServiceInstance serviceInstance = loadBalancerClient.choose("miw-eureka-service");
	        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
	        System.out.println(url);
	        return restTemplate.getForObject(url, String.class);
	    }*/
	  /*  @GetMapping("/consumer2")
	    public String dc2() {
	        return restTemplate.getForObject("http://miw-eureka-service/dc", String.class);
	    }*/
	    @GetMapping("/consumer3")

	    public String dc3() {
	        return consumerService.consumer();
	    }
	    
	    /**
	     * 容错处理 服务降级
	     * @return
	     */
		@HystrixCommand(fallbackMethod="callback")
		@GetMapping("/down") 
	    public String hystrix(){
			return consumerService.consumer2();
	    }
		public String callback(){
			System.out.println("错误。。。");
			return "错误";
		}
		@HystrixCommand(fallbackMethod="callback")
		@GetMapping("/down2") 
	    public String hystrix2(){
			return consumerService.consumer();
	    }
}
