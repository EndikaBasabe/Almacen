package main;

import controlador.ClienteControlador;
import controlador.PedidoControlador;
import controlador.ProductoControlador;
import modelo.ClienteModelo;
import modelo.DetallesPedidoModelo;
import modelo.PedidoModelo;
import modelo.ProductoModelo;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.BezeroarenEskariak;
import vista.BorrarCliente;
import vista.EskariKudeatzailea;
import vista.EskariaListatu;
import vista.Nagusia;
import vista.ProduktuFormulario;
import vista.ProduktuKudeaketa;

public class Main {

	public static void main(String[] args) {
		
		//kontroladore eta modeloen instantziak sortu
		
		ClienteControlador clienteControlador = new ClienteControlador();
		ProductoControlador productoControlador = new ProductoControlador();
		PedidoControlador pedidoControlador = new PedidoControlador();
		ClienteModelo clienteModelo = new ClienteModelo();
		ProductoModelo productoModelo = new ProductoModelo();
		PedidoModelo pedidoModelo = new PedidoModelo();
		DetallesPedidoModelo detallesPedidoModelo = new DetallesPedidoModelo();
		//lehioak sortu
		Nagusia nagusia = new Nagusia();
		BezeroKudeatzailea bezeroKudeatzailea = new BezeroKudeatzailea(nagusia,true);
		BezeroFormulario bezeroFormulario = new BezeroFormulario(bezeroKudeatzailea,true);
		ProduktuFormulario produktuFormulario = new ProduktuFormulario();
		ProduktuKudeaketa produktuKudeaketa = new ProduktuKudeaketa();
		BorrarCliente borrarCliente = new BorrarCliente(bezeroKudeatzailea,true);
		EskariKudeatzailea eskariKudeatzailea = new EskariKudeatzailea(nagusia,true);
		EskariaListatu eskariaListatu = new EskariaListatu(eskariKudeatzailea,true);
		BezeroarenEskariak bezeroarenEskariak = new BezeroarenEskariak(bezeroKudeatzailea,true);
		//leihoei controladoreak ezarri
	
		bezeroFormulario.setClienteControlador(clienteControlador);
		bezeroFormulario.setProductoControlador(productoControlador);
		bezeroKudeatzailea.setClienteControlador(clienteControlador);
		bezeroKudeatzailea.setProductoControlador(productoControlador);
		nagusia.setClienteControlador(clienteControlador);
		nagusia.setProductoControlador(productoControlador);
		nagusia.setPedidoControlador(pedidoControlador);
		produktuFormulario.setClienteControlador(clienteControlador);
		produktuFormulario.setProductoControlador(productoControlador);
		produktuKudeaketa.setClienteControlador(clienteControlador);
		produktuKudeaketa.setProductoControlador(productoControlador);
		borrarCliente.setClientecontrolador(clienteControlador);
		eskariKudeatzailea.setPedidoControlador(pedidoControlador);
		eskariaListatu.setPedidoControlador(pedidoControlador);
		bezeroarenEskariak.setClienteControlador(clienteControlador);
		bezeroarenEskariak.setPedidoControlador(pedidoControlador);
		
		//controladoreei modelo eta lehioak ezarri
		
		clienteControlador.setClienteModelo(clienteModelo);
		clienteControlador.setBezeroFormulario(bezeroFormulario);
		clienteControlador.setBezeroKudeatzailea(bezeroKudeatzailea);
		clienteControlador.setNagusia(nagusia);
		clienteControlador.setBorrarCliente(borrarCliente);
		clienteControlador.setBezeroarenEskariak(bezeroarenEskariak);
		clienteControlador.setPedidoModelo(pedidoModelo);
		clienteControlador.setDetallesPedidoModelo(detallesPedidoModelo);
		
		pedidoControlador.setNagusia(nagusia);
		pedidoControlador.setEskariKudeatzailea(eskariKudeatzailea);
		pedidoControlador.setEskariaListatu(eskariaListatu);
		pedidoControlador.setPedidoModelo(pedidoModelo);
		pedidoControlador.setDetallesPedidoModelo(detallesPedidoModelo);
		pedidoControlador.setClienteModelo(clienteModelo);
		pedidoControlador.setBezeroarenEskariak(bezeroarenEskariak);
		
		nagusia.setVisible(true);
		
		
		
	}

}
