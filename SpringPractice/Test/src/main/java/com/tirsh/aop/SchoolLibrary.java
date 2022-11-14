package com.tirsh.aop;

import com.tirsh.aop.AbstractLibrary;

public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We are taking book from school library");
    }
}
