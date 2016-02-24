package com.tieto.vasekric.boot.di.models;

/**
 * Created by vasek on 24.02.2016.
 */
public class Hello {
    private String hello;

    public Hello(String hello) {
        this.hello = hello;
    }

    public Hello() {
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "hello='" + hello + '\'' +
                '}';
    }
}
