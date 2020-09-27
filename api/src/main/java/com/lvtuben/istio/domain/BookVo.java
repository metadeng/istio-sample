package com.lvtuben.istio.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * book vo
 */
public class BookVo implements Serializable {
    private String id;
    private String name;
    private String author;
    private BookDetailVo bookDetailVo;
    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BookDetailVo getBookDetailVo() {
        return bookDetailVo;
    }

    public void setBookDetailVo(BookDetailVo bookDetailVo) {
        this.bookDetailVo = bookDetailVo;
    }

    public BookVo(String id, String name, String author, BookDetailVo bookDetailVo, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.bookDetailVo = bookDetailVo;
        this.price = price;
    }

    public BookVo() {
    }
}
