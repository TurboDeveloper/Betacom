package it.betacom.architetture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import it.betacom.businnesscomponent.model.Utente;

public class UtenteDAO implements DAOConstants{
	private Connection conn;
	
	public UtenteDAO() throws ClassNotFoundException, SQLException{
		conn = DBAccess.getConnection();
	}
	
	public void selectAll() throws SQLException {
		Statement stmt = conn.createStatement();
		//stmt.executeUpdate("Update ........");
		ResultSet rs = stmt.executeQuery(SELECT_UTENTE);
		//oggetto java che mantiene il risultato di uno statement
		ResultSetMetaData meta = rs.getMetaData();
		//stamiamo le intestazioni di colonna
		for(int i = 1; i <= meta.getColumnCount(); i++)
			System.out.printf("%-20s\t",meta.getColumnName(i));
		System.out.println();
		//avanza e controlla anche se ce un dato
		while(rs.next()) {
			for(int i = 1; i <= meta.getColumnCount(); i++)
				System.out.printf("%-20s\t",rs.getObject(i));
			System.out.println();
		}
	}
	
	public void create(Utente utente) throws SQLException{
		Statement stmt = conn.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(INSERT_UTENTE);
		rs.moveToInsertRow();
		rs.updateString(1, utente.getNome());
		rs.updateString(2, utente.getCognome());
		rs.updateString(3, utente.getUsername());
		rs.insertRow();
		conn.commit();
		System.out.println("Inserimento Riga");
				
	}
	
	//una contiene cosa mettere, uno dice quale modificare
	public void update(Utente objSet, Utente objWhere) throws SQLException{
		String username = objWhere.getUsername();
		
		PreparedStatement stmt = conn.prepareStatement(UPDATE_UTENTE,
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		stmt.setString(1, username); // compila la query con il punto di domanda
		//e al primo punto di domanda inserisce l username
		ResultSet rs = stmt.executeQuery();
		rs.first();//posiziono il cursore sul orimo record
		rs.updateString(1, objSet.getNome());
		rs.updateString(2, objSet.getCognome());

		rs.updateRow();
		conn.commit();
		System.out.println("Aggiornamento Riga");
	}
	
	public void delete(Utente u) throws SQLException{
		PreparedStatement stmt = conn.prepareStatement(DELETE_UTENTE,
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		stmt.setString(1, u.getUsername());
		ResultSet rs = stmt.executeQuery();
		rs.first();//posiziono il cursore sul orimo record

		rs.deleteRow();
		conn.commit();
		System.out.println("Eliminazione Riga");
	}
}
