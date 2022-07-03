package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConexion {
	
	public static Connection getConexion() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			String url = "jdbc:mysql://localhost/petsmile";
			String usr = "root";
			String psw = "root";
			
			con = DriverManager.getConnection(url,usr,psw);
			
			System.out.println("Conexión OK");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error --> al cargar Driver");		
			
		} catch (SQLException e) {			
			System.out.println("Error --> al conectar con la BD");
			
		}	
		return con;
	}

}
