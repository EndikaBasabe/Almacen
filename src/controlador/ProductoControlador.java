/**
 * 
 */
package controlador;

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
public class ProductoControlador {
	
	//TODO atributuak jarri
	
	private BezeroFormulario bezeroFormulario; 
	private BezeroKudeatzailea bezeroKudeatzailea; 
	private Nagusia nagusia;
	private ProduktuFormulario produktuFormulario; 
	private ProduktuKudeaketa produktuKudeaketa;
	private ClienteModelo clienteModelo;
	private ProductoModelo productoModelo; 
	public void zabalduProduktuKudeatzailea(){
		//TODO produktu kuedeatzailea leihoa zabaldu
		
	}
	
	public void zabalduProduktuFormularioa(){
		//TODO produktu formularioa zabaldu
		
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
