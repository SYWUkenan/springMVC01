package cn.yswu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yswu
 * @date 2021-07-04 23:36
 *
 *
 */


@Controller
public class InterceptorController {


    @RequestMapping("/test01")
    public String test01(){
        System.out.println("请求方法执行中！");
        return "admin";
    }

}
