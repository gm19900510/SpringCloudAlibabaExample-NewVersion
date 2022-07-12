package com.jztx.gm.demo.nacos_config.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取Nacos配置
 * 
 * @author 高明
 *
 */
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {
	@Value("${useLocalCache:false}")
	private boolean useLocalCache;

	@Value("${name}")
	private String name;

	@RequestMapping("/get")
	public boolean get() {
		return useLocalCache;
	}

	@RequestMapping("/name")
	public String name() {
		return name;
	}
}
