package com.lvtuben.istio.book.service;

import com.lvtuben.istio.book.dao.BookDAO;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
public interface BookService {
    /**
     * 获取书籍信息
     *
     * @param id
     * @return
     */
    BookDAO getBookById(String id);
}
