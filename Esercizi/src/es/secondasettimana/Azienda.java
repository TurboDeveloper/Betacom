package es.secondasettimana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Azienda {
	
	
	//private HashMap<Integer, Venditore> venditori = new HashMap<Integer, Venditore>();
	private HashSet<Venditore> venditori = new HashSet<Venditore>();
	private ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
	
	
	public Azienda() {
		super();
		
		fillData();
	}


	private void fillData() {
		
		Random rand = new Random();
		ArrayList<Integer> exists = new ArrayList<Integer>();
		while(venditori.size() < 5) {
			int id = rand.nextInt(10) + 1 ;
			//venditori.put(id, new Venditore(id, "MIMMO" + id));
			if(!exists.contains(id)) {
				venditori.add(new Venditore(id, "MIMMO" + id));
			}
		}
		
		while(prodotti.size() < 6) {
			int cod = rand.nextInt(5) + 1;
			int prize = rand.nextInt(100) + 1;
			prodotti.add(new Prodotto(cod, prize));
		}
	}
	
	public int nVen() {
		return venditori.size();
	}
	
	public Iterator getVen() {
		return venditori.iterator();
	}


	public Prodotto getProdotto(int i) {
		return prodotti.get(i);
	}
}
