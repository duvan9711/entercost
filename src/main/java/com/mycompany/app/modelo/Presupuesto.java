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
@Table(name = "presupuesto")
public class Presupuesto implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpresupuesto")
	private int idpresupuesto;
	@Column(name="fechapresupuesto")
	private Date fechapresupuesto;
	@Column(name="calculopresupuesto")
	private int calculopresupuesto;
	public int getIdpresupuesto() {
		return idpresupuesto;
	}
	public void setIdpresupuesto(int idpresupuesto) {
		this.idpresupuesto = idpresupuesto;
	}
	public Date getFechapresupuesto() {
		return fechapresupuesto;
	}
	public void setFechapresupuesto(Date fechapresupuesto) {
		this.fechapresupuesto = fechapresupuesto;
	}
	public int getCalculopresupuesto() {
		return calculopresupuesto;
	}
	public void setCalculopresupuesto(int calculopresupuesto) {
		this.calculopresupuesto = calculopresupuesto;
	}

}
