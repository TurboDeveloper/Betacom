package it.betacom.businnessmodel.model;

import java.util.Date;

public class Utente {
	private String username;
	private Date nascita;
	private String password;
	
	public Utente() {
		super();
	}
	public Utente(String username, Date nascita, String password) {
		super();
		this.username = username;
		this.nascita = nascita;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Utente [username=" + username + ", nascita=" + nascita + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getNascita() {
		return nascita;
	}
	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
