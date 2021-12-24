package com.mj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    BeanFactory beanFactory;

    @RequestMapping("/")
    public String createNewService() {
        // instead of new SomeService we get it from the BeanFactory
        SomeService repo = beanFactory.getBean(SomeService.class);

        return "Hello World!";
    }
}