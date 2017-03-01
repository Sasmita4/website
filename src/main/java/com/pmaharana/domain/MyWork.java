package com.pmaharana.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="myWork")
public class MyWork  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1835766149548275049L;

	@Id
	private String id;
	
	@NotNull
	private String data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	

}
