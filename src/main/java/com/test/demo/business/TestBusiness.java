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
        List<Collection> result = dataBaseConfig.findDataInCollection("TestData","1996") ;
        return result;
    }
}
