package com.jztx.products.web.example.sentinel.nacos.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Nacos持久化Sentinel规则 启动类
 * 
 * @author 高明
 *
 */
@SpringBootApplication
public class SentinelNacosConfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelNacosConfApplication.class, args);
	}

}
