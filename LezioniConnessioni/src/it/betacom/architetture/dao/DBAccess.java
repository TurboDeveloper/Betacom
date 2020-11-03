package it.betacom.architetture.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccess implements DAOConstants{
	private static Connection conn;
	
	public synchronized static Connection getConnection() 
		throws ClassNotFoundException, SQLException{
		//metodo che puo essere usato da piu clieny(thread) -> necessario sincronizzarlo
		//bisogna specifare anche le modalita di connessione
		Class.forName(JDBC_DRIVER); //reflection su driver
		//forname alloca in memoria il driver che viene ispezionato dal Dmanager
		conn = DriverManager.getConnection(JDBC_URL, USERNAME, PSW);
		conn.setAutoCommit(false);
		//conn jdbc autocommittante e se lavoro con db in autocommit si genera errore dunque in questo caso
		return conn;
	}
	
	public static void closeConnection() throws SQLException{
		if(conn != null)
			conn.close();
	}
}
