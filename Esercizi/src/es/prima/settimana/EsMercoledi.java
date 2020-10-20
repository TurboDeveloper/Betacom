package es.prima.settimana;
/*
*  ESERCIZIO 1:
* **************************************************************************************
*	In una matrice sono presenti i seguenti dati:
*	riga: nome studente
*	colonna: valutazione studente
*	Calcolare le seguenti statistiche:
*		• voto più basso
*		• voto più alto
*		• media per studente
*			• stampa complessiva dei voti per sudente ordinando da studente più meritevole a meno meritevole.
* 
* 
* ESERCIZIO 2
* **************************************************************************************
*	Scrivere un programma di assegnamento posti. (capienza massima vagone: 50 posti, 20 prima classe 30
*	seconda classe. Totale vagoni 3.)
*	Visualizzare le seguenti opzioni di prenotazione:
*		1 - per la prima classe
*		2 - per la seconda classe
*	Dopo la pronatozione visualizzare una schematica piantina con il posto assegnato.
*	I vagoni vanno occupati progressivamente.
*	Quando la sezione prima classe (per tutti i vagoni) è terminata chiedere al passeggero se vuole passare in
*	seconda e viceversa.
*	Se i posti sono tutti occupati visualizzare il rispettivo messaggio.
* 
* ESERCIZIO 3
* **************************************************************************************
*	In una matrice con due colonne e dieci righe, visualizzare quella con maggior numero di elementi pari.
*/

import java.util.Arrays;
import java.util.Scanner;

public class EsMercoledi {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Che esercizio vuoi fare? ");
		int n1 = in.nextInt();
	if(n1 == 1) {
		esercizio1();
	}else {
	}
	}

	private static void esercizio1() {
		
		String [] [] registro = {{"Mimmo","8","8","8"},
				{"Luigi","7","7","7"},
				{"Luisa","4","4","4"},
				{"Tommaso","2","2","2"}};
		
		Studente [] studenti = new Studente [registro.length];
		Studente2 [] studenti2 = new Studente2 [registro.length];
		int [] medie = new int[registro.length];
		
		for(int i = 0; i < registro.length; i++) {
		int votoBasso = 0, votoAlto = 0, media = 0;
		for(int j = 1; j < registro[i].length; j++) {
		
		System.out.println("I = " + i + "  J = "+ j+ "  " + registro[i][j]);	
		 Integer voto = Integer.parseInt(registro[i][j]);
		 if(j == 0) { votoBasso =
		 voto; 
		 votoAlto = voto; 
		 } else if(votoBasso > voto) { 
			 votoBasso = voto;
			 }else if(votoAlto < voto) { 
				 votoAlto = voto; 
				 } 
		 media += voto;
		 
		}
		media /= registro[i].length;
		studenti[i] = new Studente(registro[i][0], media, registro[i]);
		studenti2[i] = new Studente2(registro[i][0], media, registro[i]);
		}
		
		//ArrayList<Studente> classe = (ArrayList<Studente>)Arrays.asList(studenti);
		//creare comparator
		Arrays.sort(studenti, new StudentiComparator()); //comparatore esterno
		System.out.println("COMPARATORE ESTERNO");
		for(Studente s : studenti) {
		System.out.println(s.toString());
		}
		System.out.println();
		
		//implementare con comparatore interno
		System.out.println("COMPARATORE INTERNO");
		Arrays.sort(studenti2);
		for(Studente2 s : studenti2) {
		System.out.println(s.toString());
		}
		
	}
}	
