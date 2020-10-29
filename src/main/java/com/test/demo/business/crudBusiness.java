package com.test.demo.business;

import com.test.demo.collection.collection;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.demo.dbConfig.databaseConfig;
import java.util.Optional;

public class crudBusiness {
    @Autowired
    public databaseConfig dataBaseConfig;

    public Optional<collection> findUser(String name){
        //To Do Query parameter and findOne.
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("{name:{$eq:");
//        queryString.append(name);
//        queryString.append("}");
//        BasicQuery query = new BasicQuery(queryString.toString());
        return dataBaseConfig.findById(name);
    }
}
