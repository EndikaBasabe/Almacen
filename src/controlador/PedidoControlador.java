package controlador;

import java.util.ArrayList;

import modelo.Pedido;
import modelo.PedidoModelo;
import vista.EskariKudeatzailea;
import vista.EskariaListatu;
import vista.Nagusia;

public class PedidoControlador {

	private Nagusia nagusia;
	private EskariKudeatzailea eskariKudeatzailea;
	private EskariaListatu eskariaListatu;
	private PedidoModelo pedidoModelo;
	
	
	public Nagusia getNagusia() {
		return nagusia;
	}
	public void setNagusia(Nagusia nagusia) {
		this.nagusia = nagusia;
	}
	public EskariKudeatzailea getEskariKudeatzailea() {
		return eskariKudeatzailea;
	}
	public void setEskariKudeatzailea(EskariKudeatzailea eskariKudeatzailea) {
		this.eskariKudeatzailea = eskariKudeatzailea;
	}
	public EskariaListatu getEskariaListatu() {
		return eskariaListatu;
	}
	public void setEskariaListatu(EskariaListatu eskariaListatu) {
		this.eskariaListatu = eskariaListatu;
	}
	public PedidoModelo getPedidoModelo() {
		return pedidoModelo;
	}
	public void setPedidoModelo(PedidoModelo pedidoModelo) {
		this.pedidoModelo = pedidoModelo;
	}
	public void irekiEskariKudeatzailea() {
		this.eskariKudeatzailea.setVisible(true);
		
	}
	public void irekiEskariListatua() {
		ArrayList<Pedido> pedidos = this.pedidoModelo.seleccionarTodos();
		this.eskariaListatu.pedidoTaulaBete(pedidos);
		
		this.eskariaListatu.setVisible(true);
		
	}
	
	
}
