package com.github.zhenglc.uc.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 14:24 2018/6/21
 * @Modified By:
 * @Version:
 */
@RestController
@RequestMapping("user")
public class UserRest {
    @Value("${language.en:你好世界}")
    private String Hello;
    @RequestMapping("/{id}")
    public String getUserInfo(@PathVariable String id) {
        return Hello;
    }
}
