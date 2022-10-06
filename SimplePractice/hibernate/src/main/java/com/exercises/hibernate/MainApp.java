package com.exercises.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass((Detail.class))
                .buildSessionFactory();
        Session session = null;

        // =====CREATE=====
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item milk = new Item("Milk", 80);
//        System.out.println(milk);
//        session.save(milk);
//        System.out.println(milk);
//        session.getTransaction().commit();
        // =====GET FROM DB=====
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemFromDb = session.get(Item.class, 1L);
//        session.getTransaction().commit();
//        System.out.println(itemFromDb);

//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item newItem = session.createQuery("SELECT i FROM Item i WHERE i.id = 2", Item.class)
////                .getResultList();
//                .getSingleResult();

//        List<Item> newItems = session.createQuery("SELECT i FROM Item i", Item.class)
//                .getResultList();
//        System.out.println(newItems);
//        session.getTransaction().commit();

        // =====UPDATE=====
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemFromDb = session.get(Item.class, 1L);
//        itemFromDb.setPrice(200);
//        //session.flush();
//        session.getTransaction().commit();
        // =====DELETE=====
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemFromDb = session.get(Item.class, 1L);
//        session.remove(itemFromDb);
//        session.getTransaction().commit();

        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Book book = session.get(Book.class, 1L);
        System.out.println(book);
        System.out.println(book.getDetail());
        System.out.println(book.getDetail().getBook());
        session.getTransaction().commit();

        sessionFactory.close();
    }
}
