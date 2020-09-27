package com.lvtuben.istio.web.service.impl;

import com.lvtuben.istio.web.service.WebService;
import org.springframework.boot.actuate.info.Info;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-04-08
 **/
@Service
public class WebServiceImpl implements WebService {

    @Override
    public Map<String, Object> version() {
        Date date = new Date();
        Info.Builder builder = new Info.Builder();
        builder.withDetail("version", "v2").withDetail("time", date.getTime()).withDetail("service", "op-web");
        return builder.build().getDetails();
    }
}
