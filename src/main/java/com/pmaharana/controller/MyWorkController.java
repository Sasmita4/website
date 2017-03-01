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

import com.pmaharana.domain.MyWork;
import com.pmaharana.sevice.MyWorkService;

@Controller
public class MyWorkController {
	Logger log = LoggerFactory.getLogger(MyWorkController.class);
	
	@Autowired
	MyWorkService myWorkService;
	
	@RequestMapping(value="/myWork", method=RequestMethod.GET)
	public ResponseEntity<List<MyWork>> myWork(){
		List<MyWork> result = myWorkService.myWorkUrls();
       if(result.isEmpty()){
           return new ResponseEntity<List<MyWork>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<MyWork>>(result, HttpStatus.OK);
	}
}
