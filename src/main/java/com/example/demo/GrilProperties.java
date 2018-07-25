package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 当配置属性增多的时候，使用配置文件进行分组。
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GrilProperties {

    private  Integer age;
    private  String cupSize;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
}
