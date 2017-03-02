package com.pmaharana.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="contact")
public class Contact implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3731409699196422267L;

	@Id
	private String id;

	@NotNull
	private String conactPersonName;
	
	@NotNull
	private String contactPersonEmail;
	
	@NotNull
	private String contactPersonPh;
	
	@NotNull
	private String contactPersonMsg;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConactPersonName() {
		return conactPersonName;
	}
	public void setConactPersonName(String conactPersonName) {
		this.conactPersonName = conactPersonName;
	}
	public String getContactPersonEmail() {
		return contactPersonEmail;
	}
	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}
	public String getContactPersonPh() {
		return contactPersonPh;
	}
	public void setContactPersonPh(String contactPersonPh) {
		this.contactPersonPh = contactPersonPh;
	}
	public String getContactPersonMsg() {
		return contactPersonMsg;
	}
	public void setContactPersonMsg(String contactPersonMsg) {
		this.contactPersonMsg = contactPersonMsg;
	}
}
