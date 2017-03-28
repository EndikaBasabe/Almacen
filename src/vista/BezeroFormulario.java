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
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BezeroFormulario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_Nombre;
	private JTextField textField_telefono;
	private JTextField textField_direccion;
	private JTextField textField_codPostal;

	private ClienteControlador clienteControlador;
	private ProductoControlador productoControlador;
	/**
	 * Create the dialog.
	 */
	public BezeroFormulario(JDialog parent,boolean modal) {
		
		super(parent,modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel label_id = new JLabel("id");
		label_id.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_direccion = new JLabel("direccion");
		label_direccion.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_codPostal = new JLabel("codPostal");
		label_codPostal.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Nombre.setColumns(10);
		
		textField_telefono = new JTextField();
		textField_telefono.setColumns(10);
		
		textField_direccion = new JTextField();
		textField_direccion.setColumns(10);
		
		textField_codPostal = new JTextField();
		textField_codPostal.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteControlador.guardarCliente(textField.getText(),textField_Nombre.getText(),textField_telefono.getText(),textField_direccion.getText(),textField_codPostal.getText());
				clienteControlador.itxiBezeroFormulario();
			}
		});
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_codPostal)
								.addComponent(label_direccion)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(label_id, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblTelefono))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_telefono, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addComponent(textField_codPostal, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addComponent(textField_direccion, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addComponent(textField_Nombre, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnGuardar)
							.addGap(33))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_id)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefono)
						.addComponent(textField_telefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_direccion)
						.addComponent(textField_direccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_codPostal)
						.addComponent(textField_codPostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
					.addComponent(btnGuardar)
					.addContainerGap())
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
