package com.pmaharana.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="galleryAndVideo")
public class GalleryAndVideo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7498563797895276479L;

	@Id
	private String id;
	
	@NotNull
	private String content_type;
	
	@NotNull
	private String title;
	
	@NotNull
	private String data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}