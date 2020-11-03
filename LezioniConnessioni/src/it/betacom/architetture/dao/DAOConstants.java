package it.betacom.architetture.dao;

public interface DAOConstants {
	String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	String USERNAME = "turbo";
	String PSW = "pass";
	
	String SELECT_UTENTE = "Select * from utente";
	String INSERT_UTENTE = "Select nome,cognome,username from utente";
	String UPDATE_UTENTE = "Select nome,cognome,username from utente where username = ? ";
	String DELETE_UTENTE = "Select nome,cognome,username from utente where username = ?";
}
