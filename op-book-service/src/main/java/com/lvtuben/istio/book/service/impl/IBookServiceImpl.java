package com.lvtuben.istio.book.service.impl;


import com.lvtuben.istio.IService.IBookService;
import com.lvtuben.istio.book.dao.BookDAO;
import com.lvtuben.istio.book.dao.BookDetailDAO;
import com.lvtuben.istio.book.mapper.BookDAOMapper;
import com.lvtuben.istio.book.mapper.BookDetailDAOMapper;
import com.lvtuben.istio.domain.BookDetailVo;
import com.lvtuben.istio.domain.BookVo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;

import java.util.Date;
import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
@Service
public class IBookServiceImpl implements IBookService {
    @Autowired
    private BookDAOMapper bookDAOMapper;

    @Autowired
    private BookDetailDAOMapper bookDetailDAOMapper;

    @Override
    public BookVo getBookById(String id) {
        BookDAO bookDAO = bookDAOMapper.selectByPrimaryKey(id);
        if (bookDAO == null) {
            return new BookVo();
        }
        BookDetailDAO bookDetailDAO = bookDetailDAOMapper.selectByPrimaryKey(bookDAO.getId());
        BookDetailVo bookDetailVo = new BookDetailVo(bookDetailDAO.getId(), bookDetailDAO.getImages(), bookDAO.getAuthor());
        return new BookVo(bookDAO.getbId(), bookDAO.getName(), bookDAO.getAuthor(), bookDetailVo, bookDAO.getPrice());
    }

    @Override
    public Map<String, Object> version() {
        Date date = new Date();
        Info.Builder builder = new Info.Builder();
        builder.withDetail("version", "v1").withDetail("time", date.getTime()).withDetail("service", "op-book");
        return builder.build().getDetails();
    }
}
