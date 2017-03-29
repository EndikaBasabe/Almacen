/**
 * 
 */
package controlador;

import modelo.Cliente;
import modelo.ClienteModelo;
import modelo.ProductoModelo;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.BorrarCliente;
import vista.Nagusia;
import vista.ProduktuFormulario;
import vista.ProduktuKudeaketa;

/**
 * @author enautirakasle
 * 24 mar. 2017
 */

public class ClienteControlador {

	//TODO atributuak jarri
	BezeroFormulario bezeroFormulario;
	BezeroKudeatzailea bezeroKudeatzailea;
	Nagusia nagusia;
	ClienteModelo clienteModelo;
	BorrarCliente borrarCliente;
	
	public void zabalduBezeroKuedeatzailea(){
		//TODO bezero kudeatzailea leihoa zabaldu
		this.bezeroKudeatzailea.setVisible(true);
	}
	
	public void zabalduBezeroFormularioa(){
		//TODO bezero formularioa zabaldu
		this.bezeroFormulario.setVisible(true);
	}

	public BezeroFormulario getBezeroFormulario() {
		return bezeroFormulario;
	}

	public void setBezeroFormulario(BezeroFormulario bezeroFormulario) {
		this.bezeroFormulario = bezeroFormulario;
	}

	public BezeroKudeatzailea getBezeroKudeatzailea() {
		return bezeroKudeatzailea;
	}

	public void setBezeroKudeatzailea(BezeroKudeatzailea bezeroKudeatzailea) {
		this.bezeroKudeatzailea = bezeroKudeatzailea;
	}

	public Nagusia getNagusia() {
		return nagusia;
	}

	public void setNagusia(Nagusia nagusia) {
		this.nagusia = nagusia;
	}

	public ClienteModelo getClienteModelo() {
		return clienteModelo;
	}

	public void setClienteModelo(ClienteModelo clienteModelo) {
		this.clienteModelo = clienteModelo;
	}
	
	
	public BorrarCliente getBorrarCliente() {
		return borrarCliente;
	}

	public void setBorrarCliente(BorrarCliente borrarCliente) {
		this.borrarCliente = borrarCliente;
	}

	public void itxiBezeroFormulario() {
		// TODO Apéndice de método generado automáticamente
		this.bezeroFormulario.dispose();
	}

	public void guardarCliente(String id, String nombre, String telefono, String direccion, String codPostal) {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(id);
		cliente.setNombre(nombre);
		cliente.setTelefono(telefono);
		cliente.setDireccion(direccion);
		cliente.setCodPostal(codPostal);
		this.clienteModelo.insert(cliente);
		
	}

	public void abrirBorrarFormulario() {
		this.borrarCliente.setVisible(true);		
	}

	

	
}
