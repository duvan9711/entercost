package com.mycompany.app.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private int id;
	@Column(name = "nombreUsuario")
	private String nombreUsuario;
	@Column(name = "apellidoUsuario")
	private String apellidousuario;
	@Column(name = "fechaNacimiento")
	private Date fecnacUsuario;
	@Column(name = "edadUsuario")
	private Integer edadusuario;
	@Column(name = "telefono")
	private Integer telefonoUsuario;
	@Column(name = "correoUsuario")
	private String correo;
	@Column(name = "direccionUsuario")
	private String direccionUsuario;
	@Column(name = "clave")
	private String CLAVE;
	
	@ManyToMany
    @JoinTable(name="usuarios_roles",
            joinColumns = {@JoinColumn(name="idusuario",referencedColumnName="idusuario")},
            inverseJoinColumns = {@JoinColumn(name="idRol",referencedColumnName="idRol") })
     private List<Rol> roles;
	

	
	@OneToMany(mappedBy = "usuario")
	private List<Compra> listCompra;
	
	@OneToMany(mappedBy = "usuario")
	private List<Proyecto> listproyecto;
	
	@OneToMany(mappedBy = "usuario")
	private List<Inventario> listInventario;
	
	
	@OneToMany(mappedBy = "usuario")
	private List<Pago> listPago;


}
