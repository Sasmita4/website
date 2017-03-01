package com.pmaharana.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pmaharana.domain.MyWork;

@Repository
public interface MyWorkRepository extends MongoRepository<MyWork, String>{

}
