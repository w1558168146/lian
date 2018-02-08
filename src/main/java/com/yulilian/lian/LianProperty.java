package com.yulilian.lian;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by YuLilian on 2018/1/7.
 * desc:
 */
@Component
@ConfigurationProperties(prefix = "lian")
public class LianProperty {

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
