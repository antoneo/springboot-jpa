package com.ace.domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ACE_XTGN")
public class XTGN implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2699713955844369105L;

	@Id
	@GeneratedValue
	@Column(name="ID_XTGN")
	private int id;
	
	@Column(name="NM_XTGN",nullable = false)
	private String name;
	
	@Column(name="ICO_XTGN",nullable = false)
	private String icoXtgn;
	
	@Column(name="SEQ_XTGN",nullable = false)
	private String seqXtgn;
	
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="ID_XTGN")
	private List<GNMX> gnmx=new ArrayList<GNMX>();

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

	public String getIcoXtgn() {
		return icoXtgn;
	}

	public void setIcoXtgn(String icoXtgn) {
		this.icoXtgn = icoXtgn;
	}

	public String getSeqXtgn() {
		return seqXtgn;
	}

	public void setSeqXtgn(String seqXtgn) {
		this.seqXtgn = seqXtgn;
	}
	

	public List<GNMX> getGnmx() {
		return gnmx;
	}

	public String toString(){
		return "ACE_XTGN [ID_XTGN="+id+",NM_XTGN="+name+",ICO_XTGN="+icoXtgn+",SEQ_XTGN="+seqXtgn+"]";
	}
}
