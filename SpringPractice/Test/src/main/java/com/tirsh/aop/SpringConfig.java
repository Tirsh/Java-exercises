package com.tirsh.aop;

import com.tirsh.aop.aspects.LoginAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("com.tirsh.aop.aspects")
@EnableAspectJAutoProxy
public class SpringConfig {
    @Bean
    public Library libraryBean(){
        return new Library();
    }

}
