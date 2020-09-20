package com.reader.entity;

import java.util.Date;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private Date publish_time;
    private Integer word_numer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Integer getWord_numer() {
        return word_numer;
    }

    public void setWord_numer(Integer word_numer) {
        this.word_numer = word_numer;
    }
}
