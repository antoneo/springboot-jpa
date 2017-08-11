package com.ace.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACE_USER")
public class USER implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7977139645063245619L;
	
	@Id
	@GeneratedValue
	@Column(name="ID_USER",nullable=false)
	private int id;
	@Column(name="NM_USER",nullable=false)
	private String name;
	@Column(name="PWD_USER",nullable=false)
	private String pwdUser;
	@Column(name="EMAIL_USER")
	private String emailUser;
	@Column(name="PHONE_USER")
	private String phoneUser;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwdUser() {
		return pwdUser;
	}
	public void setPwdUser(String pwdUser) {
		this.pwdUser = pwdUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getPhoneUser() {
		return phoneUser;
	}
	public void setPhoneUser(String phoneUser) {
		this.phoneUser = phoneUser;
	} 
	
	public String toString(){
		return "ACE_USER [ID_USER="+id+",NM_USER="+name+",PWD_USER="+pwdUser+",EMAIL_USER="+emailUser+",PHONE_USER="+phoneUser+"]";
	}
}
