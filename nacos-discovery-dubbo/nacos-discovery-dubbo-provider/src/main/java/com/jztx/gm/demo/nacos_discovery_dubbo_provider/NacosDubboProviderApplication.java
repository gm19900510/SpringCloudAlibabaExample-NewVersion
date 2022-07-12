package com.jztx.gm.demo.nacos_discovery_dubbo_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
/**
 * 功能描述 SpringCloud alibaba -dubbo
 */
@EnableDubbo
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDubboProviderApplication.class, args);
	}

}
