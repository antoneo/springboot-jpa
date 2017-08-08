package com.Ace.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="spi_gnmx")
public class GNMX implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2099848757922284112L;

	@Id
	@Column(name="id_gnmx",nullable = false)
	private int id;
	
	@Column(name="id_xtgn",nullable = false)
	private int idXtgn;
	@Column(name="nm_gnmx",nullable = false)
	private String name;
	@Column(name="url_gnmx")
	private String urlGnmx;
	@Column(name="ico_gnmx")
	private String icoGnmx;
	@Column(name="seq_gnmx",nullable = false)
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
		return "GNMX [id_gnmx="+id+",id_xtgn="+idXtgn+",nm_gnmx="+name+",ico_xtgn="+icoGnmx+",url_gnmx="+urlGnmx+",seq_gnmx="+seqGnmx+"]";
	}
}
