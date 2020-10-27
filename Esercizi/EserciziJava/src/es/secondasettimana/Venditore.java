package es.secondasettimana;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

public class Venditore implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7787343856669260613L;


	@Override
	public String toString() {
		return "Venditore [nome=" + nome + ", id=" + id + ", totVenditeMen=" + totVenditeMen + "]";
	}

	private String nome;
	private int id;
	private transient HashMap<Integer, HashSet<Modulo>> moduli = new HashMap<Integer, HashSet<Modulo>>();
	private HashMap<Integer, Integer> totVenditeMen = new HashMap<Integer, Integer>();
	
	
	
	public Venditore(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	
	public HashMap<Integer, HashSet<Modulo>> getModuli() {
		return moduli;
	}


	public void setModuli(HashMap<Integer, HashSet<Modulo>> moduli) {
		this.moduli = moduli;
	}


	public String getNome() {
		return nome;
	}


	public int getId() {
		return id;
	}

	public void addVendita(Integer m , Integer i) {
		if(this.totVenditeMen.get(m) != null)
			this.totVenditeMen.replace(m, this.totVenditeMen.get(m) + i);
		else
			this.totVenditeMen.put(m, i);
	}

	public void addModule(Integer mese, Modulo m) {	
		if(this.moduli.get(mese) != null)
			this.moduli.get(mese).add(m);
		else {
			this.moduli.put(mese, new HashSet<Modulo>());
			this.moduli.get(mese).add(m);
		}
			
	}
}
