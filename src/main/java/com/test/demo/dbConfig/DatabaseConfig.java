package com.test.demo.dbConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.test.demo.collection.Collection;

import java.util.List;

@Transactional
@Repository
public interface DatabaseConfig extends MongoRepository<Collection,String> {

    @Query(value  = "{'data': ?0}",count = true)
    public List<Collection> findData(String type);

    public List<Collection> findAllByTitle(String title);

    public List<Collection> findOneByYear(String year);
}
