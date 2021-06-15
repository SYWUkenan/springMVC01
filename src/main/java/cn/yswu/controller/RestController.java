package cn.yswu.controller;

import cn.yswu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author yswu
 * @date 2021-06-15 17:24
 *
 * 用户功能的rest风格
 */

@Controller
@RequestMapping("/rest")
public class RestController {

    /**
     * 查询用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public String get(@PathVariable("id") Integer id){
        System.out.println("查询用户："+id);
        return  "index.jsp";

    }

    /**
     * 增加用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    public String add(User user){
        System.out.println("增加用户"+user);
        return  "index.jsp";

    }


    /**
     * 修改用户
     * @param id
     * @return
     */
    @PutMapping("/user/{id}")
    public String update(User user){
        System.out.println("修改用户；"+user);
        return "index.jsp";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Integer id){
        System.out.println("删除用户："+id);
        return "index.jsp";
    }

}
