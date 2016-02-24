package com.tieto.vasekric.boot.di;

import com.tieto.vasekric.boot.di.models.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by vasek on 24.02.2016.
 */
@Configuration
public class HelloBean {

    @Bean
    @Scope("prototype")
    public Hello hello() {
        return new Hello("Hi all");
    }
}
