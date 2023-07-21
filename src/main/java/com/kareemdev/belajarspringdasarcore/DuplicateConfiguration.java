package com.kareemdev.belajarspringdasarcore;

import com.kareemdev.belajarspringdasarcore.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateConfiguration {

    @Bean
    public Foo foo1(){
        return new Foo();
    }
    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
