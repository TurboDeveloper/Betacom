package it.betacom.file.serializzazione;

import java.io.Serializable;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7465798438028098862L;
	private int id;
	private String nome;
	private String cognome;
	private transient double statoCredito;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public double getStatoCredito() {
		return statoCredito;
	}
	public void setStatoCredito(double statoCredito) {
		this.statoCredito = statoCredito;
	}
	
	public Cliente() {
		this(0,"","",0.00);
	}
	
	public Cliente(int id, String nome, String cognome, double statoCredito) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.statoCredito = statoCredito;
	}
	
	
}
