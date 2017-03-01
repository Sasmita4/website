package com.pmaharana.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pmaharana.domain.GalleryAndVideo;
import com.pmaharana.sevice.GalleryAndVideoService;

@Controller 
public class GalleryAndVideoController {
	Logger log = LoggerFactory.getLogger(GalleryAndVideoController.class);
	
	@Autowired
	GalleryAndVideoService galleryAndVideoService;
	
	@RequestMapping(value="/galleryAndVideos", method=RequestMethod.GET)
	public ResponseEntity<List<GalleryAndVideo>> galleryAndVideos(){
		List<GalleryAndVideo> result = galleryAndVideoService.galleryAndVideoUrls();
       if(result.isEmpty()){
           return new ResponseEntity<List<GalleryAndVideo>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<GalleryAndVideo>>(result, HttpStatus.OK);
	}
}
