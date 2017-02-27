package com.pmaharana.sevice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmaharana.domain.Background;
import com.pmaharana.repository.BackgroundRepository;

@Service
public class BackgroundService {

	Logger log = LoggerFactory.getLogger(BackgroundService.class);
	
	@Autowired
	BackgroundRepository backgroundRepository;
	
	public List<Background>  getUrl() {
		List<Background> background = backgroundRepository.findAll();
		
		return background;
	}

}
