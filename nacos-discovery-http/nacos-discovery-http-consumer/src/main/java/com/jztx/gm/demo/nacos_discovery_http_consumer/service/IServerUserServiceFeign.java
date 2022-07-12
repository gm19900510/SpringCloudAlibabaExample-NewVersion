package com.jztx.gm.demo.nacos_discovery_http_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-discovery-http-provider")
public interface IServerUserServiceFeign {

    @RequestMapping(value = "selectOne",method = RequestMethod.GET)
    String selectOne(@RequestParam("id")String id);

}
