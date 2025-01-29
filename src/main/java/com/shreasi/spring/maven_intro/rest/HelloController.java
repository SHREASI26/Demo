package com.shreasi.spring.maven_intro.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String hello(){
        return "Hello World!!! "+coachName;
    }

    @GetMapping("/devtools")
    public String devToolsTest(){
        return "devtools is a developers tool that restarts/reload automatically application upon updation";
    }
}
