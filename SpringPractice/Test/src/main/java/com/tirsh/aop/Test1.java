package com.tirsh.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UniLibrary uniLibrary = context.getBean("libraryBean", UniLibrary.class);
//        Book book = context.getBean("book", Book.class);

        SchoolLibrary schoolLib = context.getBean("schoolBean", SchoolLibrary.class);
        uniLibrary.getBook();
        uniLibrary.getMagazine();
        uniLibrary.returnBook();

        context.close();

    }
}
