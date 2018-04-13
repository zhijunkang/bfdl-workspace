package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HellloController {
    @Autowired
    private DiscoveryClient client;
    @GetMapping("/hello")
    public String index() {
        client.getServices().forEach(id -> {
            client.getInstances(id).forEach(instance -> {
                log.info("/hello,host: {} service_id: {}", instance.getHost(), instance.getServiceId());
            });
        });
        return "Hello World";
    }

}
