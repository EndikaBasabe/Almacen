package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private int id;
	private String idCliente;
	private Date fecha;
	private String codPostal;

	private ArrayList<DetallesPedido> detallesPedidos;
	
	private Cliente cliente;
	
	public Pedido(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}


	public ArrayList<DetallesPedido> getDetallesPedidos() {
		return detallesPedidos;
	}


	public void setDetallesPedidos(ArrayList<DetallesPedido> detallesPedidos) {
		this.detallesPedidos = detallesPedidos;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
