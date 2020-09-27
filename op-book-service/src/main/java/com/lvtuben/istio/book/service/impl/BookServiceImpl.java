package com.lvtuben.istio.book.service.impl;

import com.lvtuben.istio.book.dao.BookDAO;
import com.lvtuben.istio.book.mapper.BookDAOMapper;
import com.lvtuben.istio.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDAOMapper bookDAOMapper;

    @Override
    public BookDAO getBookById(String id) {
        BookDAO bookDAO = bookDAOMapper.selectByPrimaryKey(id);
        if (bookDAO == null) {
            return new BookDAO();
        }
        return bookDAO;
    }
}
