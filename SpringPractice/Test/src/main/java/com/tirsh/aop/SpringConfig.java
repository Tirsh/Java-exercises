package com.tirsh.aop;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.tirsh.aop.aspects")
@EnableAspectJAutoProxy
public class SpringConfig {
    @Bean
    public AbstractLibrary libraryBean(){
        return new UniLibrary();
    }

    @Bean
    public AbstractLibrary schoolBean(){ return new SchoolLibrary();}

}
