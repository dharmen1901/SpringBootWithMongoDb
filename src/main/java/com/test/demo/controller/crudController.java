package com.test.demo.controller;

import com.test.demo.collection.collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.test.demo.business.crudBusiness;

import java.util.List;
import java.util.Optional;

@RequestMapping("/crud")
public class crudController {

    @Autowired
    public crudBusiness crudBusiness;

    @GetMapping("get")
    public Optional<collection> findUser(@PathVariable String name){
        return crudBusiness.findUser(name);
    }
}
