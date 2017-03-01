package com.pmaharana.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmaharana.domain.GalleryAndVideo;
import com.pmaharana.repository.GalleryAndVideoRepository;

@Service
public class GalleryAndVideoService {
	@Autowired
	GalleryAndVideoRepository galleryAndVideoRepository;

	public List<GalleryAndVideo> galleryAndVideoUrls() {
		List<GalleryAndVideo> result = galleryAndVideoRepository.findAll();
		return result;
	}
}
