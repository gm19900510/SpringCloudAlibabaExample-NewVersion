package com.jztx.products.web.example.sentinel.nacos.conf.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "sentinel")
public class SentinelHelloController {

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello() {
		return "GM";
	}

}
