package com.pmaharana.dto;

import java.io.Serializable;

public class BackgroundDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8397696662269147288L;
	public String id;
	public String url;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
