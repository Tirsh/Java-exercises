package com.tirsh.aop;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.tirsh.aop ")
@EnableAspectJAutoProxy
public class SpringConfig {
    @Bean
    public UniLibrary libraryBean(){
        return new UniLibrary();
    }

    @Bean
    public SchoolLibrary schoolBean(){ return new SchoolLibrary();}

}
