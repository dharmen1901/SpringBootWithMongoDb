package com.test.demo.controller;

import com.test.demo.collection.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.test.demo.business.CrudBusiness;

import java.util.Optional;

@RequestMapping("/crud")
public class CrudController {

    @Autowired
    public CrudBusiness crudBusiness;

    @GetMapping("get")
    public Optional<Collection> findUser(@PathVariable String name){
        return crudBusiness.findUser(name);
    }
}
