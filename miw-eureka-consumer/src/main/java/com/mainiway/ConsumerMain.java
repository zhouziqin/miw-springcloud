package com.mainiway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 消费中心
 * @EnableFeignClients 负载中心
 * @author zzq
 *
 */
 
//容错
//@EnableCircuitBreaker
//负载均衡
@EnableFeignClients
//注册中心
//@EnableDiscoveryClient
//@SpringBootApplication
@SpringCloudApplication
@EnableHystrix
public class ConsumerMain {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsumerMain.class).web(true).run(args);

	}
	/**
	 * 这里使用ribbon 作为负载中心控制
	 * @return
	 */
/*	@LoadBalanced
	@Bean
	public RestTemplate retTemplate(){
		return new RestTemplate();
	}*/

}
