package cn.yswu.controller;

import cn.yswu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yswu
 * @date 2021-06-12 16:58
 */

@Controller
@RequestMapping("/path")
public class PathVariableController {

    /**
     * 获取用户实体 传输用户id
     * @return
     */
    @RequestMapping("/user/{id}/{name}")
    public String param01(@PathVariable("id") String id,@PathVariable("name") String name){
        System.out.println(id);
        System.out.println(name);
        return "/index.jsp";

    }

    /**
     * pathvariable  获取参数名称 自动映射 user中的属性名
     * @param user
     * @return
     */
    @RequestMapping("/user01/{id}/{name}")
    public String param02(User user){
        System.out.println(user);

        return "/index.jsp";

    }
}
