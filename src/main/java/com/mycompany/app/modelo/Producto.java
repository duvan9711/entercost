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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproducto")
	public int idproducto;
	@Column(name="nombreproducto")
	public String nombreproducto;
	@Column(name="fechaproducto")
	public Date fechaproducto;
	@Column(name="precioproducto")
	public int precioproducto;
	@Column(name="categoriaproducto")
	public String categoriaproducto;
	
	@ManyToMany
    @JoinTable(name="producto_inventario",
            joinColumns = {@JoinColumn(name="idproducto",referencedColumnName="idproducto")},
            inverseJoinColumns = {@JoinColumn(name="idiventario",referencedColumnName="idinventario") })
     private List<Inventario> inventarios;
	
	
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public Date getFechaproducto() {
		return fechaproducto;
	}
	public void setFechaproducto(Date fechaproducto) {
		this.fechaproducto = fechaproducto;
	}
	public int getPrecioproducto() {
		return precioproducto;
	}
	public void setPrecioproducto(int precioproducto) {
		this.precioproducto = precioproducto;
	}
	public String getCategoriaproducto() {
		return categoriaproducto;
	}
	public void setCategoriaproducto(String categoriaproducto) {
		this.categoriaproducto = categoriaproducto;
	}
	
	
	

}
