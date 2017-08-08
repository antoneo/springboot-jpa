package com.Ace.domain;
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
@Table(name="spi_xtgn")
public class XTGN implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2699713955844369105L;

	@Id
	@GeneratedValue
	@Column(name="id_xtgn")
	private int id;
	
	@Column(name="nm_xtgn",nullable = false)
	private String name;
	
	@Column(name="ico_xtgn",nullable = false)
	private String icoXtgn;
	
	@Column(name="seq_xtgn",nullable = false)
	private String seqXtgn;
	
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="id_xtgn")
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
		return "XTGN [id_xtgn="+id+",nm_xtgn="+name+",ico_xtgn="+icoXtgn+",seq_xtgn="+seqXtgn+"]";
	}
}
