package com.hwy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/9/4 13:58
 **/
@RestController
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "hello index. test url: /captcha/create";
    }
}
