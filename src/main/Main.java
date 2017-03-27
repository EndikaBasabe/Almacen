package main;

import controlador.ClienteControlador;
import controlador.ProductoControlador;
import modelo.ClienteModelo;
import modelo.ProductoModelo;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.Nagusia;
import vista.ProduktuFormulario;
import vista.ProduktuKudeaketa;

public class Main {

	public static void main(String[] args) {
		//TODO ondorengo komentarioeta jartzen duena bete
		
		//kontroladore eta modeloen instantziak sortu
		
		ClienteControlador clienteControlador = new ClienteControlador();
		ProductoControlador productoControlador = new ProductoControlador();
		ClienteModelo clienteModelo = new ClienteModelo();
		ProductoModelo productoModelo = new ProductoModelo();
		
		//lehioak sortu
		BezeroFormulario bezeroFormulario = new BezeroFormulario();
		BezeroKudeatzailea bezeroKudeatzailea = new BezeroKudeatzailea();
		Nagusia nagusia = new Nagusia();
		ProduktuFormulario produktuFormulario = new ProduktuFormulario();
		ProduktuKudeaketa produktuKudeaketa = new ProduktuKudeaketa();
		//leihoei controladoreak ezarri
	
		bezeroFormulario.setClienteControlador(clienteControlador);
		bezeroFormulario.setProductoControlador(productoControlador);
		bezeroKudeatzailea.setClienteControlador(clienteControlador);
		bezeroKudeatzailea.setProductoControlador(productoControlador);
		nagusia.setClienteControlador(clienteControlador);
		nagusia.setProductoControlador(productoControlador);
		produktuFormulario.setClienteControlador(clienteControlador);
		produktuFormulario.setProductoControlador(productoControlador);
		produktuKudeaketa.setClienteControlador(clienteControlador);
		produktuKudeaketa.setProductoControlador(productoControlador);
		
		
		//controladoreei modelo eta lehioak ezarri
		
		clienteControlador.setClienteModelo(clienteModelo);
		clienteControlador.setProductoModelo(productoModelo);
		clienteControlador.setBezeroFormulario(bezeroFormulario);
		clienteControlador.setBezeroKudeatzailea(bezeroKudeatzailea);
		clienteControlador.setNagusia(nagusia);
		clienteControlador.setProduktuFormulario(produktuFormulario);
		clienteControlador.setProduktuKudeaketa(produktuKudeaketa);
		
	}

}
