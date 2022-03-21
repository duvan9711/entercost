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
@Table(name = "pago")
public class Pago implements Serializable  {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpago")
	private int idpago;
	@Column(name = "preciopago")
	private int preciopago;
	@Column(name = "fechapago")
	private Date fechapago;
	
	@ManyToOne
	@JoinColumn(name="listPago")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="listPagos")
	private Compra compra;
	
    
	public int getIdpago() {
		return idpago;
	}
	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}
	public int getPreciopago() {
		return preciopago;
	}
	public void setPreciopago(int preciopago) {
		this.preciopago = preciopago;
	}
	public Date getFechapago() {
		return fechapago;
	}
	public void setFechapago(Date fechapago) {
		this.fechapago = fechapago;
	}
	
}