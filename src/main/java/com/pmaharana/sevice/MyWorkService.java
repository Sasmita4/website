package com.pmaharana.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmaharana.domain.MyWork;
import com.pmaharana.repository.MyWorkRepository;

@Service
public class MyWorkService {
	
	@Autowired
	MyWorkRepository myWorkRepository;

	public List<MyWork> myWorkUrls() {
		List<MyWork> result = myWorkRepository.findAll();
		return result;
	}
}
