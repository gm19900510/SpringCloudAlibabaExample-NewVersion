package com.jztx.gm.demo.nacos_discovery_http_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class NacosHttpProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosHttpProviderApplication.class, args);
    }

}
