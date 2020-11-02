package com.test.demo.business;

import com.test.demo.collection.Collection;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.demo.dbConfig.DatabaseConfig;
import java.util.Optional;

public class CrudBusiness {
    @Autowired
    public DatabaseConfig dataBaseConfig;

    public Optional<Collection> findUser(String name){
        //To Do Query parameter and findOne.
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("{name:{$eq:");
//        queryString.append(name);
//        queryString.append("}");
//        BasicQuery query = new BasicQuery(queryString.toString());
        return dataBaseConfig.findById(name);
    }
}
