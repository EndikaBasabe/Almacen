package vista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteControlador;
import controlador.ProductoControlador;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

//TODO claseari izena aldatu BigarrenLehioa beharrean BezeroKudeatzailea
public class BezeroKudeatzailea extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ClienteControlador clienteControlador;
	private ProductoControlador productoControlador;
	/**
	 * Create the dialog.
	 */
	public BezeroKudeatzailea(JFrame parent,boolean modal) {
		
		super(parent,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnBezeroak = new JButton("Bezeroak");
		btnBezeroak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clienteControlador.zabalduBezeroFormularioa();
			}
		});
		btnBezeroak.setBounds(133, 86, 137, 23);
		contentPanel.add(btnBezeroak);
		
		JButton btnConsulta = new JButton("Kontsulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsulta.setBounds(133, 146, 137, 23);
		contentPanel.add(btnConsulta);
		
		JLabel lblBigarrenLeihoa = new JLabel("Bezero Kudeatzailea:");
		lblBigarrenLeihoa.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBigarrenLeihoa.setBounds(126, 30, 218, 20);
		contentPanel.add(lblBigarrenLeihoa);
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
