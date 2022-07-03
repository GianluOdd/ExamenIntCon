package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Usuario;
import utils.MySQLConexion;

public class GestionUsuario {
	
	public Usuario obtenerUsuario(Usuario usu){
		
		Usuario usuario = null;
		
		Connection con= null;
		PreparedStatement pst=null;
		ResultSet rs = null;
		
		try {
			
			con=MySQLConexion.getConexion();
			
			String sql="select * from usuario where nombreUsuario = ? and password = ? ";
			
			pst=con.prepareStatement(sql);
			pst.setString(1, usu.getNombreUsuario());
			pst.setString(2, usu.getPassword());
			
			rs=pst.executeQuery();
			while(rs.next()){
				usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
			
		}catch(Exception e) {
			System.out.print("Error en obtener el usuario");			
			
		}
		
		
		
		return usuario;
		
	}

}
