package com.lvtuben.istio.web.controller;

import com.lvtuben.istio.web.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-04-08
 **/
@RestController
@RequestMapping("web")
@CrossOrigin
public class WebController {
    @Autowired
    private WebService webService;

    @GetMapping("/version")
    public Map<String, Object> version() {
        return webService.version();
    }
}
