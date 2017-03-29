package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
import controlador.ClienteControlador;
import modelo.Cliente;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BorrarCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ClienteControlador clientecontrolador;
	private JComboBox comboBoxBorrar;
	

	public BorrarCliente(JDialog parent,boolean modal) {
		
		super(parent,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		comboBoxBorrar = new JComboBox();
		comboBoxBorrar.setBounds(149, 104, 219, 20);
		
		JLabel ElegirCliente = new JLabel("Elegir cliente :");
		ElegirCliente.setBounds(58, 107, 81, 14);
		ElegirCliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(122, 182, 88, 23);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientecontrolador.borrarCliente();
			}
		});
		contentPanel.setLayout(null);
		contentPanel.add(ElegirCliente);
		contentPanel.add(comboBoxBorrar);
		contentPanel.add(btnBorrar);
		
		JLabel lblBorrarCliente = new JLabel("BORRAR CLIENTE");
		lblBorrarCliente.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		lblBorrarCliente.setBounds(139, 33, 176, 14);
		contentPanel.add(lblBorrarCliente);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(258, 182, 89, 23);
		contentPanel.add(btnCancelar);
	}

	public ClienteControlador getClientecontrolador() {
		return clientecontrolador;
	}


	public void setClientecontrolador(ClienteControlador clientecontrolador) {
		this.clientecontrolador = clientecontrolador;
	}


	public void llenarCombo(ArrayList<Cliente> clientes) {
		
		for (Cliente cliente : clientes){
			this.comboBoxBorrar.addItem(cliente.getId());
		}
		
	}
}