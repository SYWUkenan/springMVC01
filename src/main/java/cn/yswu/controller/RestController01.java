package cn.yswu.controller;

import cn.yswu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yswu
 * @date 2021-06-15 17:24
 *
 * 用户功能的rest风格
 *
 * 基于restful风格的服务api
 */

@RestController
@RequestMapping("/restful")
public class RestController01 {

    /**
     * 查询用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public String get(@PathVariable("id") Integer id){
        System.out.println("查询用户："+id);
        return  "{'id':'1','name':'吴雨声'}";

    }

    /**
     * 增加用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    public String add(User user){
        System.out.println("增加用户"+user);
        return  "{'msg':'success'}";

    }


    /**
     * 修改用户
     * @param
     * @return
     */
    @PutMapping("/user/{id}")
    public String update(User user){
        System.out.println("修改用户；"+user);
        return "{'msg':'success'}";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Integer id){
        System.out.println("删除用户："+id);
        return "{'msg':'success'}";
    }

}
