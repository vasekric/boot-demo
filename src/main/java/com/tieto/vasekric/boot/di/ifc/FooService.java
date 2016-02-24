package com.tieto.vasekric.boot.di.ifc;

import com.tieto.vasekric.boot.di.models.Foo;
import org.springframework.stereotype.Service;

/**
 * Created by vasek on 24.02.2016.
 */
public interface FooService {
    Foo getFoo();
}
