package com.example;

public class Book extends BaseEntity {
    private String title;
    private String author;
    private String isbn;

    public Book(long id, String title, String author, String isbn) {
        super(id);
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
}