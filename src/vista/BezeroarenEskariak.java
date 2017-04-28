package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.ClienteControlador;
import controlador.PedidoControlador;
import modelo.Cliente;
import modelo.ClienteModelo;
import modelo.DetallesPedidoModelo;
import modelo.Pedido;
import modelo.PedidoModelo;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BezeroarenEskariak extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ClienteControlador clienteControlador;
	private ClienteModelo clienteModelo;
	private PedidoControlador pedidoControlador;
	private DetallesPedidoModelo detallesPedidoMOdelo;
	private JTable tableBezeroak;
	private JTable tablePedidos;
	private JTable tableDetallesPedido;
	private JTextField textField;
	
	/**
	 * Create the dialog.
	 */
	public BezeroarenEskariak(JDialog parent,boolean modal) {
		super(parent,modal);
		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 61, 332, 186);
		contentPanel.add(scrollPane);
		
		tableBezeroak = new JTable();
		tableBezeroak.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				int aukeratutakoLerroa = tableBezeroak.getSelectedRow();
				String idCliente = (String) tableBezeroak.getModel().getValueAt(aukeratutakoLerroa, 0);
				String nombre = (String) tableBezeroak.getModel().getValueAt(aukeratutakoLerroa, 1);
				clienteControlador.pedidoakErakutsi(idCliente,nombre);
			}
		});
		scrollPane.setViewportView(tableBezeroak);
		
		JLabel lblBezeroenEskariak = new JLabel("BEZEROEN ESKARIAK");
		lblBezeroenEskariak.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBezeroenEskariak.setBounds(210, 22, 203, 14);
		contentPanel.add(lblBezeroenEskariak);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(31, 270, 332, 139);
		contentPanel.add(scrollPane_1);
		
		tablePedidos = new JTable();
		scrollPane_1.setViewportView(tablePedidos);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(385, 58, 239, 331);
		contentPanel.add(scrollPane_2);
		
		tableDetallesPedido = new JTable();
		scrollPane_2.setViewportView(tableDetallesPedido);
		
		JLabel lblPrezioa = new JLabel("Prezioa :");
		lblPrezioa.setBounds(422, 418, 56, 14);
		contentPanel.add(lblPrezioa);
		
		textField = new JTextField();
		textField.setBounds(478, 415, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
	}

	public ClienteControlador getClienteControlador() {
		return clienteControlador;
	}

	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}

	public ClienteModelo getClienteModelo() {
		return clienteModelo;
	}

	public void setClienteModelo(ClienteModelo clienteModelo) {
		this.clienteModelo = clienteModelo;
	}

	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}

	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}

	public DetallesPedidoModelo getDetallesPedidoMOdelo() {
		return detallesPedidoMOdelo;
	}

	public void setDetallesPedidoMOdelo(DetallesPedidoModelo detallesPedidoMOdelo) {
		this.detallesPedidoMOdelo = detallesPedidoMOdelo;
	}

	public void bezeroenTaulaBete(ArrayList<Cliente> clientes) {
	DefaultTableModel defaultTableModel = new DefaultTableModel();
	
	Object[] cabecera = {"ID","NOMBRE"};
	
	defaultTableModel.setColumnIdentifiers(cabecera);
	
	for(Cliente cliente : clientes){
		
		Object[] linea = {cliente.getId(),cliente.getNombre()};
		defaultTableModel.addRow(linea);
	}
		tableBezeroak.setModel(defaultTableModel);
		
		TableRowSorter<DefaultTableModel> ordenatuta;
		ordenatuta = new TableRowSorter<DefaultTableModel>(defaultTableModel);
		tableBezeroak.setRowSorter(ordenatuta);
	}

	public void pedidoTablaBete(ArrayList<Pedido> pedidos) {
		// TODO Apéndice de método generado automáticamente
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		
		Object[] cabecera = {"ID","FECHA","COD.POSTAL","CANTIDAD"};
		
		defaultTableModel.setColumnIdentifiers(cabecera);
		
		for(Pedido pedido : pedidos){
			
			Object[] linea = {pedido.getId(),pedido.getFecha(),pedido.getCodPostal(),pedido.getDetallesPedidos().size()};
			
			defaultTableModel.addRow(linea);
		}
		tablePedidos.setModel(defaultTableModel);
		
		TableRowSorter<DefaultTableModel> ordenatuta;
		ordenatuta = new TableRowSorter<DefaultTableModel>(defaultTableModel);
		tableDetallesPedido.setRowSorter(ordenatuta);
	}
	
}
