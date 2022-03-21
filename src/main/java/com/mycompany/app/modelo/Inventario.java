package com.mycompany.app.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="inventario")
public class Inventario implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idinventario")
	public int id;
	@Column(name="nombrematerial")
	public String nombre;
	@Column(name="cantidadmaterial")
	public int cantidad;
	@Column(name="categoria")
	public String categoria;
	@Column(name="fechaingreso")
	public Date fechaingreso;
	@Column(name="fechasalida")
	public Date fechasalida;
	
	@ManyToOne
	@JoinColumn(name="listInventario")
	private Usuario usuario;
	
	@ManyToMany(mappedBy = "inventarios")
    private List<Producto> productos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Date getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
	public Date getFechasalida() {
		return fechasalida;
	}
	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}
	
	
	

}
