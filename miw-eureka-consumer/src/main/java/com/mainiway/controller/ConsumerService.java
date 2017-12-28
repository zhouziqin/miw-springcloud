package com.mainiway.controller;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.mainiway.util.FeignConfiguration;

import feign.RequestLine;

 
/**
 * 只用feign 作为负载中心
 * @author dell
 *
 */
@FeignClient(name="miw-eureka-service",configuration=FeignConfiguration.class)
public interface ConsumerService {

	@RequestLine("GET /dc")
    String consumer();
	@RequestLine("GET /dc2")
	
    String consumer2();
}
