package it.betacom.collection;

import java.util.Enumeration;

public class ProdottiTest {
	
	public static void main(String[] args) {
		ProdottiHashTable prodotto= new ProdottiHashTable();
		prodotto.aggiungiProdotto("1", "Apple", "Mac pro", 3000);
		prodotto.aggiungiProdotto("2", "Apple", "iPhone", 1200);
		prodotto.aggiungiProdotto("3", "Samsung", "s10", 800);
		prodotto.aggiungiProdotto("3", "Samsung", "s10", 800);
		prodotto.aggiungiProdotto("2", "Apple", "iPhone", 1200);
		prodotto.aggiungiProdotto("4", "Samsung", "s9", 700);

		System.out.println("Totale articoli " + prodotto.getNumeroArticoli() );

		System.out.println("totale complessivo " + prodotto.totaleComplessivo());

		System.out.println("totale parziale samsung s 10 :" + prodotto.totaleParziale("3"));

		prodotto.rimuoviProdotto("2");

		System.out.println("totale parziale iPhone :" + prodotto.totaleParziale("2"));

		prodotto.rimuoviProdotto("2");

		Enumeration<String[]>listaProdotti= prodotto.listaProdotti();
		// enumeration ci serve per ritornare il numero dell'oggetto nella hashtable
		// il javadoc dice: an enumeration of the values in this hashtable.
		String dati[];
		while(listaProdotti.hasMoreElements()) { //questo hasMoreElements è un metodo di enumeration
			dati=listaProdotti.nextElement();
			System.out.println(dati[0]+"\t"+dati[1]);
		}

	}
}
