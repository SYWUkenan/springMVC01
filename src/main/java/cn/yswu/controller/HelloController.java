package cn.yswu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yswu
 * @date 2021-06-02 16:09
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("hello springmvc:" + name);

        //redirect 重定向 url会变化
        //forword 转发  url不会产生变化
        return "redirect:index.jsp";

    }
}
