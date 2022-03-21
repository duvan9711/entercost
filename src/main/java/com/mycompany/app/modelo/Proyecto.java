package com.mycompany.app.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="proyecto")
public class Proyecto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproyecto")
	private int idproyecto;
	@Column(name="nombreproyecto")
	private String nombreproyecto;
	@Column(name="precioproyecto")
	private int precioproyecto;
	@Column(name="fechaproyecto")
	private Date fechaproyecto;
	@Column(name="fechafinal")
	private Date fechafinal;
	
	@ManyToOne
	@JoinColumn(name="listProyecto")
	private Usuario usuario;
	
	public int getIdproyecto() {
		return idproyecto;
	}
	public void setIdproyecto(int idproyecto) {
		this.idproyecto = idproyecto;
	}
	public String getNombreproyecto() {
		return nombreproyecto;
	}
	public void setNombreproyecto(String nombreproyecto) {
		this.nombreproyecto = nombreproyecto;
	}
	public int getPrecioproyecto() {
		return precioproyecto;
	}
	public void setPrecioproyecto(int precioproyecto) {
		this.precioproyecto = precioproyecto;
	}
	public Date getFechaproyecto() {
		return fechaproyecto;
	}
	public void setFechaproyecto(Date fechaproyecto) {
		this.fechaproyecto = fechaproyecto;
	}
	public Date getFechafinal() {
		return fechafinal;
	}
	public void setFechafinal(Date fechafinal) {
		this.fechafinal = fechafinal;
	}
	
}
