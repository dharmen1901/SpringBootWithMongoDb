package com.test.demo.controller;

import com.test.demo.collection.collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.demo.business.testBusiness;

import java.util.List;

@RestController
@RequestMapping("/test")
public class testController {
    @Autowired testBusiness testBusiness;
    @GetMapping("/rest")
    public List<collection> restResponce(){
        return testBusiness.testDetails();
    }
}
