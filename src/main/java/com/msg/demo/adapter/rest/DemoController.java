package com.msg.demo.adapter.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/v1/hello/")
public class DemoController {

    @GetMapping
    public String sayHello(@RequestParam String name) {
        log.info("Hello {}", name);
        return "Hello " + name + "!";
    }
}

