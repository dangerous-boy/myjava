package com.cxd.springboot.model;

public class Book {
    private Integer bookid;

    private String bookname;

    private Float bookmoney;

    private String booktype;

    private String author;

    private String summary;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Float getBookmoney() {
        return bookmoney;
    }

    public void setBookmoney(Float bookmoney) {
        this.bookmoney = bookmoney;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}