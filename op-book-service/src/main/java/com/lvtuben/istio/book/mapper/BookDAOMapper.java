package com.lvtuben.istio.book.mapper;

import com.lvtuben.istio.book.dao.BookDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDAOMapper {
    int deleteByPrimaryKey(String id);

    int insert(BookDAO record);

    BookDAO selectByPrimaryKey(String id);

    int updateByPrimaryKey(BookDAO record);
}