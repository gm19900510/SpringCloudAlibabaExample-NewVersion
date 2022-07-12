package com.jztx.gm.demo.nacos_discovery_http_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述 NacosHttpClient
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.jztx.gm.demo.nacos_discovery_http_consumer.service")
public class NacosHttpConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosHttpConsumerApplication.class,args);
    }
}
