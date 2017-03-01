package com.pmaharana.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pmaharana.domain.GalleryAndVideo;

@Repository
public interface GalleryAndVideoRepository extends MongoRepository<GalleryAndVideo, String>{

}
