package com.tieto.vasekric.boot.di;

import com.tieto.vasekric.boot.di.ifc.FooService;
import com.tieto.vasekric.boot.di.models.Foo;
import com.tieto.vasekric.boot.di.models.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by vasek on 24.02.2016.
 */
//@Repository  //For repositories and DAOs
//@Component   //For components
@Service   //For services
public class FooServiceImpl implements FooService {

    @Autowired private Hello hello;

    public FooServiceImpl() {
        System.out.println("Injected Hello in constructor is "+hello);
    }

    @PostConstruct
    private void init() {
        System.out.println("Injected Hello in @PostConstruct method is "+hello);
    }

    @Override
    public Foo getFoo() {
        final String hi = this.hello.getHello();
        return new Foo(hi+" from "+this.getClass().getSimpleName()+" class");
    }


}
