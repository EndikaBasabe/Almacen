/**
 * 
 */
package modelo;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author enautirakasle 24 mar. 2017
 */

public class ClienteModelo extends Conector {

	public ArrayList<Cliente> selectAll() {
		// bezero guztiak itzuliko ditu

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from clientes");
			while (rs.next()) {
				clientes.add(new Cliente(rs.getString("id"), rs.getString("nombre"), rs.getString("direccion"),
						rs.getString("codPostal"), rs.getString("telefono")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	public Cliente select(String id) {
		// TODO id hori duen cliente itzultzen du
		try {
						Statement st = this.conexion.createStatement();
						ResultSet rs = st.executeQuery("select * from clientes where id='" + id + "'");
						rs.next();
						Cliente cliente = new Cliente(rs.getString("id"), rs.getString("nombre"), rs.getString("direccion"),rs.getString("codPostal"), rs.getString("telefono"));
						return cliente;
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return null;
			 	}

	public int update(Cliente cliente) {
		// TODO clienteren id-a erabilita update egiten du
		
		try {
			Statement st = super.getConexion().createStatement();
			int lineascambiadas = st
					.executeUpdate("UPDATE clientes " + "SET nombre='" + cliente.getNombre() + "'" + " WHERE id=" + cliente.getId());
			return lineascambiadas;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public void insert(Cliente cliente) {
		try {
			PreparedStatement ps = this.conexion.prepareStatement("insert into clientes(id,nombre,direccion,codPostal,telefono) values(?,?,?,?,?)");
			ps.setString(1, cliente.getId());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getDireccion());
			ps.setString(4, cliente.getCodPostal());
			ps.setString(5, cliente.getTelefono());
			
			ps.execute();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
