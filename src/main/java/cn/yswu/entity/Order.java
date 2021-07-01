package cn.yswu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * @author yswu
 * @date 2021-06-30 16:16
 */


public class Order {

    private Integer id;
    private String name;
    @JsonIgnore
    private String password;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Order(Integer id, String name, String password, Date birthday) {
        this.id = id;
        this.name = name;

        this.password = password;
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Order() {
    }

    public Order(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
