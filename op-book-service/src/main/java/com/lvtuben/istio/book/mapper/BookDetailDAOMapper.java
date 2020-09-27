package com.lvtuben.istio.book.mapper;

import com.lvtuben.istio.book.dao.BookDetailDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDetailDAOMapper {
    int deleteByPrimaryKey(String id);

    int insert(BookDetailDAO record);

    BookDetailDAO selectByPrimaryKey(String id);

    int updateByPrimaryKey(BookDetailDAO record);
}