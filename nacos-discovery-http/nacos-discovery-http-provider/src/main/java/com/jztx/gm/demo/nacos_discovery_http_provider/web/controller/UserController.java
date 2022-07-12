package com.jztx.gm.demo.nacos_discovery_http_provider.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "selectOne",method = RequestMethod.GET)
    public String selectOne(@RequestParam String id){
        return "Hello:"+id;
    }

}
