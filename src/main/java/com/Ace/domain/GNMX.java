package com.ace.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ACE_GNMX")
public class GNMX implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2099848757922284112L;

	@Id
	@Column(name="ID_GNMX",nullable = false)
	private int id;
	
	@Column(name="ID_XTGN",nullable = false)
	private int idXtgn;
	@Column(name="NM_GNMX",nullable = false)
	private String name;
	@Column(name="URL_GNMX")
	private String urlGnmx;
	@Column(name="ICO_GNMX")
	private String icoGnmx;
	@Column(name="SEQ_GNMX",nullable = false)
	private String seqGnmx;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdXtgn() {
		return idXtgn;
	}


	public void setIdXtgn(int idXtgn) {
		this.idXtgn = idXtgn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUrlGnmx() {
		return urlGnmx;
	}


	public void setUrlGnmx(String urlGnmx) {
		this.urlGnmx = urlGnmx;
	}


	public String getIcoGnmx() {
		return icoGnmx;
	}


	public void setIcoGnmx(String icoGnmx) {
		this.icoGnmx = icoGnmx;
	}


	public String getSeqGnmx() {
		return seqGnmx;
	}


	public void setSeqGnmx(String seqGnmx) {
		this.seqGnmx = seqGnmx;
	}


	public String toString(){
		return "ACE_GNMX [ID_GNMX="+id+",ID_XTGN="+idXtgn+",NM_GNMX="+name+",ICO_XTGN="+icoGnmx+",URL_GNMX="+urlGnmx+",SEQ_GNMX="+seqGnmx+"]";
	}
}
