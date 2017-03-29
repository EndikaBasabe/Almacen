package main;

import controlador.ClienteControlador;
import controlador.ProductoControlador;
import modelo.ClienteModelo;
import modelo.ProductoModelo;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.BorrarCliente;
import vista.Nagusia;
import vista.ProduktuFormulario;
import vista.ProduktuKudeaketa;

public class Main {

	public static void main(String[] args) {
		
		//kontroladore eta modeloen instantziak sortu
		
		ClienteControlador clienteControlador = new ClienteControlador();
		ProductoControlador productoControlador = new ProductoControlador();
		ClienteModelo clienteModelo = new ClienteModelo();
		ProductoModelo productoModelo = new ProductoModelo();
		
		//lehioak sortu
		Nagusia nagusia = new Nagusia();
		BezeroKudeatzailea bezeroKudeatzailea = new BezeroKudeatzailea(nagusia,true);
		BezeroFormulario bezeroFormulario = new BezeroFormulario(bezeroKudeatzailea,true);
		ProduktuFormulario produktuFormulario = new ProduktuFormulario();
		ProduktuKudeaketa produktuKudeaketa = new ProduktuKudeaketa();
		BorrarCliente borrarCliente = new BorrarCliente(bezeroKudeatzailea,true);
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
		borrarCliente.setClientecontrolador(clienteControlador);
		
		//controladoreei modelo eta lehioak ezarri
		
		clienteControlador.setClienteModelo(clienteModelo);
		clienteControlador.setBezeroFormulario(bezeroFormulario);
		clienteControlador.setBezeroKudeatzailea(bezeroKudeatzailea);
		clienteControlador.setNagusia(nagusia);
		clienteControlador.setBorrarCliente(borrarCliente);
		
		
		nagusia.setVisible(true);
		
		
		
	}

}
