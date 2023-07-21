package com.kareemdev.belajarspringdasarcore;

import com.kareemdev.belajarspringdasarcore.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {
    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }
    @Bean(name = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
