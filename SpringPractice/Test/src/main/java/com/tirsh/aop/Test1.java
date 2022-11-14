package com.tirsh.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UniLibrary uniLibrary = context.getBean("libraryBean", UniLibrary.class);
        uniLibrary.getBook();

        SchoolLibrary schoolLib = context.getBean("schoolBean", SchoolLibrary.class);
        schoolLib.getBook();
        uniLibrary.getMagazine();
        uniLibrary.returnBook();

        context.close();

    }
}
