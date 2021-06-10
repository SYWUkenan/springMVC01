package cn.yswu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yswu
 * @date 2021-06-08 16:57
 */
@Controller
public class ParamsController {

    @RequestMapping("/param01")
    public String param01(String name){
        System.out.println(name);
        return "/index.jsp";
    }

}
