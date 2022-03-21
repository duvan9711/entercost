package com.mycompany.app.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="balance")
public class Balance implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idbalance")
	private int idbalance;
	@Column(name="fechabalance")
	private Date fechabalance;
	@Column(name="calculobalance")
	private int calculobalance;
	public int getIdbalance() {
		return idbalance;
	}
	public void setIdbalance(int idbalance) {
		this.idbalance = idbalance;
	}
	public Date getFechabalance() {
		return fechabalance;
	}
	public void setFechabalance(Date fechabalance) {
		this.fechabalance = fechabalance;
	}
	public int getCalculobalance() {
		return calculobalance;
	}
	public void setCalculobalance(int calculobalance) {
		this.calculobalance = calculobalance;
	}
	
	

}
