package com.yulilian.lian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YuLilian on 2018/1/7.
 * desc:
 */
@RestController
public class HelloApplication {

    @Autowired
    private LianProperty lianProperty;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return lianProperty.getAge()+" hello Spring boot ! This is my first time useing .";
    }
}
