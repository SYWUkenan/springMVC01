package cn.yswu.controller;

import cn.yswu.entity.Role;
import cn.yswu.entity.User;
import cn.yswu.entity.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
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
     *
     *
     * 数组：   保证每个元素的name都是相同的
     * List:  加上[索引]  name="list[0]"  如果List<User> name="list[0].name"
     * map:   必须加上[key]   name="map["key"]"
     *某个数据类型xxxx    name="xxxx.name"
     */
    @RequestMapping("/param03")
    public String param03(User user){
        System.out.println(user);
        return "/index.jsp";
    }

    /**
     * 含有多个对象传输  User Role 需要创建xxxDTO公共对象
     *      list<User>需要创建xxxDTO公共对象
     *
     *
     * @param userDTO
     * @return
     */
    @RequestMapping("/param04")
    public String param04(UserDTO userDTO){
        System.out.println(userDTO);
        return "/index.jsp";
    }

    /**
     * 获取请求头信息
     * @param host
     * @return
     */

    @RequestMapping("/header")
    public String param05(@RequestHeader("host") String host){
        System.out.println(host);
        return "/index.jsp";
    }

    /**
     * 获取cookie信息
     * @param cookie
     * @return
     */
    @RequestMapping("/cookie")
    public String cookie(@CookieValue("JESSIONID") String cookie){
        System.out.println(cookie);
        return "/index.jsp";
    }

}
