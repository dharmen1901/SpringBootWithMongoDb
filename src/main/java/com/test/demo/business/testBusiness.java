package com.test.demo.business;

import com.test.demo.collection.collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.demo.dbConfig.databaseConfig;

import java.util.List;

@Service
public class testBusiness {
    @Autowired
    public databaseConfig dataBaseConfig;

    public List<collection> testDetails(){
        List<collection> result = dataBaseConfig.findAll() ;
        return result;
    }
}
