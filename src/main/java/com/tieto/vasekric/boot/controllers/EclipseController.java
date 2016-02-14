package com.tieto.vasekric.boot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EclipseController {

    @Value("${msg.info}")
    private String info;

    @RequestMapping("/")
    public String rootInfo() {
        return String.format(info, "all of you");
    }
}
