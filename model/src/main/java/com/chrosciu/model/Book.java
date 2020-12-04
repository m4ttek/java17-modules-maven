package com.chrosciu.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
    private String author;
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book[author=" + author + ",title=" + title + "]";
    }
}
