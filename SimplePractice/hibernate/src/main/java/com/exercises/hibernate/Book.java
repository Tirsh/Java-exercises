package com.exercises.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToOne
    @JoinColumn(name = "id_details")
    private Detail detail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Book(){
    }

    public Book(String name, Detail detail) {
        this.name = name;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return String.format("Book [id = %d, name = %s]", this.id, this.name);
    }
}
