package cn.yswu.controller;

import cn.yswu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.soap.SOAPBinding;

/**
 * @author yswu
 * @date 2021-06-08 16:57
 */
@Controller
public class ParamsController {

    @RequestMapping("/param00")
    public String param01(@RequestParam(value = "name",required = true) String name){
        System.out.println(name);
        return "/index.jsp";
    }


    /**
     * 复杂参数类型传输进行绑定
     * @param name
     * @return
     *
     * 处理请求参数乱码
     * GET:
     * POST:
     *
     *
     */
    @RequestMapping("/param01")
    public String param02(@RequestParam(value = "username") String name){
        System.out.println(name);
        return "/index.jsp";
    }

    /**
     * 复杂数据类型User  直接传输该对象的属性名称就可以
     *
     * @param user
     * @return
     */
    @RequestMapping("/param03")
    public String param03(User user){
        System.out.println(user);
        return "/index.jsp";
    }
}
