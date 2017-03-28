package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteControlador;
import controlador.ProductoControlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nagusia extends JFrame {

	private JPanel contentPane;
	
	private ClienteControlador clienteControlador;
	private ProductoControlador productoControlador;
	/**
	 * Create the frame.
	 */
	public Nagusia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBezeroKudeatzailea = new JButton("Bezero Kudeatzailea");
		btnBezeroKudeatzailea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteControlador.zabalduBezeroKuedeatzailea();
			}
		});
		btnBezeroKudeatzailea.setBounds(132, 101, 177, 23);
		contentPane.add(btnBezeroKudeatzailea);
		
		JButton btnProduktuKudeatzailea = new JButton("Produktu Kudeatzailea");
		btnProduktuKudeatzailea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				productoControlador.zabalduProduktuKudeatzailea();
			}
		});
		btnProduktuKudeatzailea.setBounds(132, 160, 177, 23);
		contentPane.add(btnProduktuKudeatzailea);
		
		JLabel lblBiltegia = new JLabel("BILTEGIA");
		lblBiltegia.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblBiltegia.setBounds(173, 25, 136, 14);
		contentPane.add(lblBiltegia);
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
