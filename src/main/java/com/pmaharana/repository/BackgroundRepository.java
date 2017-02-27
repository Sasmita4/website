package com.pmaharana.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pmaharana.domain.Background;

@Repository
public interface BackgroundRepository extends MongoRepository<Background, String>{

}
