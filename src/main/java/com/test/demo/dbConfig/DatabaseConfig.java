package com.test.demo.dbConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.test.demo.collection.Collection;

import java.util.List;

@Transactional
@Repository
public interface DatabaseConfig extends MongoRepository<Collection,String> {
    public List<Collection> findAllByYear(String year);
    public List<Collection> findAllByTitle(String title);
    public List<Collection> findOneByYear(String year);
}
