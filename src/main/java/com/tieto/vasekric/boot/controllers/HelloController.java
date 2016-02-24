package com.tieto.vasekric.boot.controllers;

import com.tieto.vasekric.boot.di.ifc.FooService;
import com.tieto.vasekric.boot.di.models.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired FooService fooService; //Interface is here

    @Value("${msg.info}")
    private String info;

    @RequestMapping("/")
    public String rootInfo() {
        return String.format(info, "all of you");
    }

    @RequestMapping("/foo")
    public Foo foo() {
        return fooService.getFoo();
    }
}
