package es.secondasettimana;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/* ESERCIZIO 2 19-10-20
 * Quattro agenti vendono cinque prodotti.
	Una volta al giorno, ogni venditore compila un modulo per ogni tipologia di prodotto venduto.
		1. Codice venditore
		2. Codice prodotto
		3. Totale venduto giornaliero per ogni prodotto
	Ogni agente fornisce tra 0 e 5 moduli al giorno.
	Sono disponibili i moduli dell'ultimo mese.
	Leggere attaverso il programma le informazioni dell'ultimo mese e sommare le vendite per agente e prodotto.
	Visualizzare i dati del mese ( colonne = agenti , righe = prodotti )
	Creare un parziale di riga per ottonere il totale per ogni prodotto e sommare ogni colonna per avere il totale relativo ad ogni venditore.
 */

public class EsercizioMercoledi {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Che esercizio vuoi fare? ");
		int n1 = in.nextInt();
		
		if(n1 == 1) {
			System.out.println("SVOLGIMENTO ESERCIZIO 1");
			esercizio1();			
		}else{  
			System.out.println("SVOLGIMENTO ESERCIZIO 2");
			esercizio2();
		}
	}

	private static void esercizio1() {
		
		
	}

	private static void esercizio2() {
		
		Azienda betacom = new Azienda();

		Random rand = new Random();
		
		for(int i = 1; i <= 3; i++) {
			//System.out.println("GIORNO: " + i);
			Iterator<Venditore> it = betacom.getVen();
			while(it.hasNext()) {
				Venditore ven = it.next();
				//per ogni giorno del mese, per ogni venditore, per ogni prodotto
				for(int j = 0; j < 5; j++ ) {	
					int totProd = 0, cod = 0;
					//crea tot vendite per ogni tipo(da 0 a 4)
					totProd = (betacom.getProdotto(j).getPrezzo()) * rand.nextInt(3);
					cod = betacom.getProdotto(j).getCod();
					ven.addModule(2, new Modulo(ven.getId(), cod, totProd));
					ven.addVendita(2, totProd);
				}
			}
		//System.out.println();
		}
	
		Iterator<Venditore> it = betacom.getVen();
		while(it.hasNext()) {
			Venditore ven = it.next();
			System.out.println(ven.toString());
		}
	
		CreaRecordAgente cra = new CreaRecordAgente(betacom.getVen());
		System.out.println("LETTURA DA FILE");
		LeggiRecordAgente lra = new LeggiRecordAgente();
	}

	
	
}
