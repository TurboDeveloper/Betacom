package es.seconda.settimana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Venditore {
	
	private String nome;
	private int id;
	private HashMap<Integer, HashSet<Modulo>> moduli = new HashMap<Integer, HashSet<Modulo>>();
	
	
	
	public Venditore(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	
	public void addModule(Integer mese, Modulo m) {	
		this.moduli.get(mese).add(m);
	}
}
