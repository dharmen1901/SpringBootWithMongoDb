package com.test.demo.business;

import com.test.demo.collection.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.demo.dbConfig.DatabaseConfig;

import java.util.List;

@Service
public class TestBusiness {
    @Autowired
    public DatabaseConfig dataBaseConfig;

    public List<Collection> testDetails(){
        List<Collection> result = dataBaseConfig.findAllByTitle("5f9f857bdd66321dbc83d4ab") ;
        return result;
    }
}
