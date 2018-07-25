package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

//    /**
//     * 从配置文件中获取值
//     */
//    @Value("${cupSize}")
//    private  String cupSize;
//
//    @Value("${age}")
//    private  Integer age;
//
//    /**
//     * 在配置文件中使用配置文件。
//     */
//    @Value("${content}")
//    private String content;

    @Autowired
    private  GrilProperties grilProperties;

    @RequestMapping(value = {"/say/{id}"}, method = RequestMethod.GET)
    public  String say(@PathVariable("id") Integer id){
//        return  grilProperties.getCupSize();
//        return  "index";
        return  "id"+id;
    }
}
