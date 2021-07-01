package cn.yswu.controller;

import cn.yswu.entity.Order;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author yswu
 * @date 2021-06-30 15:55
 */

@Controller
public class JsonController {

    /**
     * 加入jackson依赖
     * @return
     */
//    @RequestMapping(value="/json/response",produces = "application/json;charset=utf-8")
    @RequestMapping(value="/json/response")
    @ResponseBody
    public Order responseJson(){
        Order order = new Order(1,"zhuge","123456",new Date());
        return order;
    }

    @RequestMapping(value="/json/response02")
    @ResponseBody
    public List<Order> responseJson02(){
        Order order1 = new Order(1,"zhuge");
        Order order2 = new Order(2,"libai");
        List<Order> order = new ArrayList<>();
        order.add(order1);
        order.add(order2);
        return order;
    }

    @PostMapping(value="/json/response03",consumes = "application/json")
    @ResponseBody
    public Order responseJson03(@RequestBody String name){
        Order order = new Order(1,"zhuge","123456",new Date());
        System.out.println("名字："+name);
        return order;

    }

    @PostMapping(value="/json/response04")
    @ResponseBody
    public Order responseJson04(@RequestBody Order order){
        Order order2 = new Order(1,"xiaowu","123456",new Date());
        System.out.println(order);
        return order2;

    }
    @RequestMapping(value="/json/response05")
    @ResponseBody
    public Order responseJson05(@RequestBody Map<String,String> map){
        Order order2 = new Order(1,"xiaowu","123456",new Date());
        System.out.println(map);
        return order2;

    }

    @RequestMapping(value="/json/response06")
    @ResponseBody
    public Order responseJson06(@RequestBody List<Order> list){
        Order order2 = new Order(1,"xiaowu","123456",new Date());
        System.out.println(list);
        return order2;

    }

}
