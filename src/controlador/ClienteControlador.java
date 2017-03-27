/**
 * 
 */
package controlador;

import modelo.Cliente;
import modelo.ClienteModelo;
import modelo.ProductoModelo;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.Nagusia;
import vista.ProduktuFormulario;
import vista.ProduktuKudeaketa;

/**
 * @author enautirakasle
 * 24 mar. 2017
 */

public class ClienteControlador {

	//TODO atributuak jarri
	BezeroFormulario bezeroFormulario = new BezeroFormulario();
	BezeroKudeatzailea bezeroKudeatzailea = new BezeroKudeatzailea();
	Nagusia nagusia = new Nagusia();
	ProduktuFormulario produktuFormulario = new ProduktuFormulario();
	ProduktuKudeaketa produktuKudeaketa = new ProduktuKudeaketa();
	ClienteModelo clienteModelo = new ClienteModelo();
	ProductoModelo productoModelo = new ProductoModelo();
	
	public void zabalduBezeroKuedeatzailea(){
		//TODO bezero kudeatzailea leihoa zabaldu
		
	}
	
	public void zabalduBezeroFormularioa(){
		//TODO bezero formularioa zabaldu
		
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

	public ProduktuFormulario getProduktuFormulario() {
		return produktuFormulario;
	}

	public void setProduktuFormulario(ProduktuFormulario produktuFormulario) {
		this.produktuFormulario = produktuFormulario;
	}

	public ProduktuKudeaketa getProduktuKudeaketa() {
		return produktuKudeaketa;
	}

	public void setProduktuKudeaketa(ProduktuKudeaketa produktuKudeaketa) {
		this.produktuKudeaketa = produktuKudeaketa;
	}

	public ClienteModelo getClienteModelo() {
		return clienteModelo;
	}

	public void setClienteModelo(ClienteModelo clienteModelo) {
		this.clienteModelo = clienteModelo;
	}

	public ProductoModelo getProductoModelo() {
		return productoModelo;
	}

	public void setProductoModelo(ProductoModelo productoModelo) {
		this.productoModelo = productoModelo;
	}
	
}
