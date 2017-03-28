package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteControlador;
import controlador.ProductoControlador;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProduktuKudeaketa extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ClienteControlador clienteControlador;
	private ProductoControlador productoControlador;
	
	/**
	 * Create the dialog.
	 */
	public ProduktuKudeaketa() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JButton produktuBerria = new JButton("Produktu berria");
		produktuBerria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productoControlador.zabalduProduktuFormularioa();
			}
		});
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(161)
					.addComponent(produktuBerria))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(79)
					.addComponent(produktuBerria))
		);
		contentPanel.setLayout(gl_contentPanel);
	}

	public ClienteControlador getClienteControlador() {
		return clienteControlador;
	}

	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}

	public ProductoControlador getProductoControlador() {
		return productoControlador;
	}

	public void setProductoControlador(ProductoControlador productoControlador) {
		this.productoControlador = productoControlador;
	}
	
}
