package com.lvtuben.istio.web.controller;

import com.lvtuben.istio.IService.IBookService;
import com.lvtuben.istio.domain.BookVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
@RestController
@RequestMapping("book")
@CrossOrigin
public class BookController {
    @Reference
    private IBookService iBookService;

    @GetMapping("/getBookById/{id}")
    public BookVo getBookById(@PathVariable("id") String id) {
        BookVo bookVo = iBookService.getBookById(id);
        return bookVo;
    }

    @GetMapping("/version")
    public Map<String, Object> version() {
        return iBookService.version();
    }
}
