package es.seconda.settimana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Azienda {
	
	
	private HashMap<Integer, Venditore> venditori = new HashMap<Integer, Venditore>();
	private ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
	
	
	public Azienda() {
		super();
		
		fillData();
		
	}


	private void fillData() {
		
		Random rand = new Random();
		while(venditori.size() < 5) {
			int id = rand.nextInt() ;
			venditori.put(id, new Venditore(id, "MIMMO" + id));
		}
		
		while(prodotti.size() < 6) {
			int cod = rand.nextInt();
			int prize = rand.nextInt();
			prodotti.add(new Prodotto(cod, prize));
		}
	}
}
