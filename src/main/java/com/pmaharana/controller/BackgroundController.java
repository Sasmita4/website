package com.pmaharana.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pmaharana.domain.Background;
import com.pmaharana.sevice.BackgroundService;

@Controller
public class BackgroundController {
	
	Logger log = LoggerFactory.getLogger(BackgroundController.class);
	
	@Autowired
	BackgroundService backgroundService;
	
	@RequestMapping(value="/backgroundUrl", method=RequestMethod.GET)
	public ResponseEntity<List<Background>>  getBackgroundUrl(Model model){
	    List<Background> result = backgroundService.getUrl();
        if(result.isEmpty()){
            return new ResponseEntity<List<Background>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Background>>(result, HttpStatus.OK);
    }
}
	