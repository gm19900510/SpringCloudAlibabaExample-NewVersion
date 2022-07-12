package com.jztx.gm.demo.nacos_discovery_http_consumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jztx.gm.demo.nacos_discovery_http_consumer.service.IServerUserServiceFeign;

@RestController
public class ClientUserController {
	@Autowired
	IServerUserServiceFeign serverUserServiceFeign;

	@RequestMapping(value = "selectOne", method = RequestMethod.GET)
	public String selectOne(@RequestParam String id) {

		return serverUserServiceFeign.selectOne(id);
	}

}
