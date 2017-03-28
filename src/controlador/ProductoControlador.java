/**
 * 
 */
package controlador;

import modelo.ClienteModelo;
import modelo.Producto;
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
	
	private Nagusia nagusia;
	private ProduktuFormulario produktuFormulario; 
	private ProduktuKudeaketa produktuKudeaketa;
	private ProductoModelo productoModelo; 
	
	
	public void zabalduProduktuKudeatzailea(){
		//TODO produktu kuedeatzailea leihoa zabaldu
		this.produktuKudeaketa.setVisible(true);
	}
	
	public void zabalduProduktuFormularioa(){
		//TODO produktu formularioa zabaldu
		this.produktuFormulario.setVisible(true);
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

	public ProductoModelo getProductoModelo() {
		return productoModelo;
	}

	public void setProductoModelo(ProductoModelo productoModelo) {
		this.productoModelo = productoModelo;
	}

	public void guardarProducto(String nombre, String proveedor, String precio, String existencias) {
		
		Producto producto = new Producto();
		
		
//		producto.setNombre(nombre);
//		producto.setProveedor(proveedor);
//		producto.setPrecio(precio);
//		producto.setExistencias(existencias);
		
	}


	

}
