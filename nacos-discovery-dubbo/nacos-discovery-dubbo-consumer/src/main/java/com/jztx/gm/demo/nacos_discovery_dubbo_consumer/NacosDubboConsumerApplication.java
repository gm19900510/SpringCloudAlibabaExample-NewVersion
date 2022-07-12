package com.jztx.gm.demo.nacos_discovery_dubbo_consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述 Nacos Dubbo consumer
 */
@EnableDubbo(scanBasePackages = "com.jztx.gm.demo.nacos_discovery_dubbo_consumer.web.controller")
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDubboConsumerApplication.class, args);
	}

}
