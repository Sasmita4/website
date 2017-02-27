package com.pmaharana.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="background")
public class Background implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4528645857120574974L;

	@Id
	private String Id;
	
	@NotNull
	private String url;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
