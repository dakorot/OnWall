package com.onwall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String author;
    private String content;
    private String date;

    public Message()
    {
        author = "";
        content = "";
        date = "";
    }

    public Message(String author, String content, String date)
    {
        this.author = author;
        this.content = content;
        this.date = date;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getContent()
    {
        return content;
    }

    public String getDate()
    {
        return date;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return author + " wrote: " + content;
    }
}