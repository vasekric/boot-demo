package com.tieto.vasekric.boot.di.models;

/**
 * Created by vasek on 24.02.2016.
 */
public class Foo {
    private String foo;

    public Foo(String foo) {
        this.foo = foo;
    }

    public Foo() {
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "foo='" + foo + '\'' +
                '}';
    }
}
