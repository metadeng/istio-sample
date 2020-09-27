package com.lvtuben.istio.IService;

import com.lvtuben.istio.domain.BookVo;

import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
public interface IBookService {
    /**
     * 获取图书信息
     *
     * @param id
     * @return
     */
    BookVo getBookById(String id);

    /**
     * 获取版本
     *
     * @return
     */
    Map<String, Object> version();
}
