package com.exercises.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "color")
    private String color;
    @Column(name = "width")
    private int width;
    @OneToOne(mappedBy = "detail")
    private Book book;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Detail() {
    }

    public Detail(String color, int width) {
        this.color = color;
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("Details [Color = %s, width = %d]", this.color, this.width);
    }
}
