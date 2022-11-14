package com.tirsh.aop;

public class UniLibrary extends AbstractLibrary{
    public void getBook(){
        System.out.println("We are taking a book from university library!");
    }

    public void returnBook(){
        System.out.println("We are returning book!");
    }

    public void getMagazine(){
        System.out.println("We are geting magazine!");
    }
}
