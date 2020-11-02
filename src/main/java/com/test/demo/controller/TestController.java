package com.test.demo.controller;

import com.test.demo.collection.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.demo.business.TestBusiness;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestBusiness testBusiness;
    @GetMapping("/rest")
    public List<Collection> restResponce(){
        return testBusiness.testDetails();
    }
}
