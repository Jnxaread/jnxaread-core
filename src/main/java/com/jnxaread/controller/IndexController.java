package com.jnxaread.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 运行测试Controller
 *
 * @author 未央
 * @create 2020-04-19 23:32
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

}
