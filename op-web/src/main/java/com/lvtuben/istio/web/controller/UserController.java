package com.lvtuben.istio.web.controller;

import com.lvtuben.istio.IService.IUserService;
import com.lvtuben.istio.domain.UserVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Reference
    private IUserService iUserService;

    @GetMapping("/getUserById/{id}")
    public UserVo getUserById(@PathVariable("id") String id) {
        return iUserService.getUserById(id);
    }

    @GetMapping("/getAllUser")
    public List<UserVo> getAllUser() {
        return iUserService.getAllUser();
    }

    @GetMapping("/version")
    public Map<String, Object> version() {
        return iUserService.version();
    }

}
