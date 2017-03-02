package com.pmaharana.dto;

import java.io.Serializable;

public class ContactDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4350711233342023483L;
	private String id;
	private String conactPersonName;
	private String contactPersonEmail;
	private String contactPersonPh;
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
