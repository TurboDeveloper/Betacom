package it.betacom.architetture.dao;

import java.sql.SQLException;

import it.betacom.businnesscomponent.model.Utente;

public class ConnectionTest implements DAOConstants{
	
	public static void main(String[] args) {
		try {
			UtenteDAO uDAO = new UtenteDAO();
			uDAO.selectAll();
			Utente u = new Utente();
			u.setNome("Mimmo");
			u.setCognome("Rossi");
			u.setUsername("Ciccio");
			//uDAO.create(u);
			uDAO.selectAll();
			Utente updateU = new Utente();
			updateU.setNome("TTUURBOOO");
			updateU.setCognome("BIANCHI");
			updateU.setUsername("Ciccio");
			uDAO.update(updateU, u);
			uDAO.selectAll();
			uDAO.delete(updateU);
			uDAO.selectAll();
			
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			e.printStackTrace();
		}finally {
			try {
				DBAccess.closeConnection();
			}catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getErrorCode());
				e.printStackTrace();
			}
		}
	}
}
