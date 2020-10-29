package com.test.demo.dbConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.test.demo.collection.collection;

@Transactional
@Repository
public interface databaseConfig extends MongoRepository<collection,String> {
}
