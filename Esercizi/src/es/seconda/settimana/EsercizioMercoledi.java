package es.seconda.settimana;

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
	}
	
}
