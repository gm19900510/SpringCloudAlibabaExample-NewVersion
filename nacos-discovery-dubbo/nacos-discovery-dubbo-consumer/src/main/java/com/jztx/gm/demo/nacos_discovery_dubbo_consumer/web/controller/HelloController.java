package com.jztx.gm.demo.nacos_discovery_dubbo_consumer.web.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jztx.gm.demo.nacos_discovery_dubbo_api.IHelloService;

/**
 * 功能描述 Hello Controller
 */
@RestController
public class HelloController {

	@DubboReference
	IHelloService helloService;

	@RequestMapping(value = "hello")
	public String hello(@RequestParam String name) {
		return helloService.hello(name);
	}

}
