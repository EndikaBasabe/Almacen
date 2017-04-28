package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.PedidoControlador;
import modelo.Cliente;
import modelo.ClienteModelo;
import modelo.DetallesPedido;
import modelo.Pedido;

import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EskariaListatu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tablePedidos;
	private JTable tableDetallesPedido;
	private JTextField textFieldNombre;
	private JTextField textFieldDireccion;
	private JTextField textFieldCodPostal;
	private JLabel lblNombre;
	private JLabel lblDireccion;
	private JLabel lblCodpostal;
	private JTextField textFieldTelefono;
	private JLabel lblTelefono;
	
	private PedidoControlador pedidoControlador;
	


	/**
	 * Create the dialog.
	 */
	public EskariaListatu(JDialog parent,boolean modal) {
		
		super(parent,modal);
		
		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPanePedidos = new JScrollPane();
		scrollPanePedidos.setBounds(21, 64, 271, 169);
		contentPanel.add(scrollPanePedidos);
		
		tablePedidos = new JTable();
		tablePedidos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				//taulatik zer lerro click-atu den jakin.
				int aukeratutakoLerroa = tablePedidos.getSelectedRow();
			
				//lerrotik, guk nahi ditugun zutabearen balioa jaso.
				int idPedido = (int)tablePedidos.getModel().getValueAt(aukeratutakoLerroa, 0);
				String idCliente = (String) tablePedidos.getModel().getValueAt(aukeratutakoLerroa, 1);
				//detalleak eta bezeroak erakutsi.(controlador)
				pedidoControlador.eskariarenDatuakErakutsi(idPedido,idCliente);
				
			}
		});
		scrollPanePedidos.setViewportView(tablePedidos);
		
		JLabel lblListadoPedidos = new JLabel("LISTADO PEDIDOS :");
		lblListadoPedidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListadoPedidos.setBounds(63, 39, 143, 14);
		contentPanel.add(lblListadoPedidos);
		
		JScrollPane scrollPaneDetallesPedido = new JScrollPane();
		scrollPaneDetallesPedido.setBounds(340, 64, 259, 169);
		contentPanel.add(scrollPaneDetallesPedido);
		
		tableDetallesPedido = new JTable();
		scrollPaneDetallesPedido.setViewportView(tableDetallesPedido);
		
		JLabel lblDetallesPedido = new JLabel("DETALLES PEDIDO :");
		lblDetallesPedido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDetallesPedido.setBounds(452, 26, 143, 14);
		contentPanel.add(lblDetallesPedido);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(97, 330, 86, 20);
		contentPanel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(97, 386, 86, 20);
		contentPanel.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		textFieldCodPostal = new JTextField();
		textFieldCodPostal.setBounds(374, 330, 86, 20);
		contentPanel.add(textFieldCodPostal);
		textFieldCodPostal.setColumns(10);
		
		JLabel lblClienteDePedido = new JLabel("CLIENTE DE PEDIDO SELECCIONADO :");
		lblClienteDePedido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClienteDePedido.setBounds(188, 276, 198, 14);
		contentPanel.add(lblClienteDePedido);
		
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(107, 305, 76, 14);
		contentPanel.add(lblNombre);
		
		lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setBounds(107, 361, 99, 14);
		contentPanel.add(lblDireccion);
		
		lblCodpostal = new JLabel("COD.POSTAL");
		lblCodpostal.setBounds(374, 305, 99, 14);
		contentPanel.add(lblCodpostal);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(374, 386, 86, 20);
		contentPanel.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(384, 361, 89, 14);
		contentPanel.add(lblTelefono);
	}


	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}


	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}


	public void pedidoTaulaBete(ArrayList<Pedido> pedidos) {
		//taula modeloa sortu.
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		
		//burukoaren array-asortu eta modeloari ezarri.
		Object[] cabecera = {"ID","IDCLIENTE","FECHA"};
		defaultTableModel.setColumnIdentifiers(cabecera);
		
		//modeloa datuekin bete.
		for(Pedido pedido : pedidos){
			
			Object [] linea = {pedido.getId(),pedido.getIdCliente(),pedido.getFecha()};
			
			defaultTableModel.addRow(linea);
		}
		
		//taulari modeloa ezarri.
		
		tablePedidos.setModel(defaultTableModel);
		
		//taula ordenagarria egin.
		TableRowSorter<DefaultTableModel> ordenatuta;
		ordenatuta = new TableRowSorter<DefaultTableModel>(defaultTableModel);
		tablePedidos.setRowSorter(ordenatuta);
	}


	public void detallePedidoTablaBete(ArrayList<DetallesPedido> detallesPedido) {
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		
		Object[] cabecera = {"idPedido","idProducto","Cantidad"};
		
		defaultTableModel.setColumnIdentifiers(cabecera);
		
		for(DetallesPedido detallePedido : detallesPedido){
			
			Object[] lerroa = {detallePedido.getIdPedido(),detallePedido.getIdProducto(),detallePedido.getCantidad()};
			
			defaultTableModel.addRow(lerroa);
		}
		tableDetallesPedido.setModel(defaultTableModel);
		
		TableRowSorter<DefaultTableModel> ordenatuta;
		ordenatuta = new TableRowSorter<DefaultTableModel>(defaultTableModel);
		tableDetallesPedido.setRowSorter(ordenatuta);
	}


	public void bezeroenTablaBete(Cliente cliente) {
		this.textFieldNombre.setText(cliente.getNombre());
		this.textFieldDireccion.setText(cliente.getDireccion());
		this.textFieldTelefono.setText(cliente.getTelefono());
		this.textFieldCodPostal.setText(cliente.getCodPostal());
		
	}
}
