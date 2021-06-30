package cn.yswu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yswu
 * @date 2021-06-30 15:55
 */

@Controller
public class JsonController {

    @RequestMapping("/json/response")
    public String responseJson(){
        System.out.println("json");
        return "json";
    }

}
