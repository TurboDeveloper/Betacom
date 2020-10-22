package es.primasettimana;
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

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Che esercizio vuoi fare? ");
		int n1 = in.nextInt();
		switch(n1) {
		case 1: System.out.println("SVOLGIMENTO ESERCIZIO 1");
				esercizio1();			
		break;
		case 2: System.out.println("SVOLGIMENTO ESERCIZIO 2");
				esercizio2();
				
		break;
		default: System.out.println("SVOLGIMENTO ESERCIZIO 3");
				 esercizio3();
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


	private static void esercizio2() {

		String[] primac = new String[60];
		String[] secondac = new String[90];
		int scelta = 0;
		int som1 = 0;
		int som2 = 0;
		int n1=0;
		do {
			System.out.println("Scegliere tra prima e seconda classe in numero");
			int sc = in.nextInt();
			scelta++;
			switch (sc) {
			case 1:
				System.out.println("quanti biglietti vuoi comprare?");
				n1 = in.nextInt();
				som1 = som1 + n1;
				for (int i = 0; i < primac.length; i++) {
					if(som1 > primac.length) {
						System.out.println("Prima classe piena, ripetere l'operazione e scegliere seconda classe");
						break;
					}
					if (i < som1)
						primac[i] = "[X]";
					else 
						primac[i] = "[ ]";
				}

				System.out.println("PRIMA CLASSE");
				for (int i = 0; i < primac.length; i++) {
					if (i != 0) {
						if (i % 20 == 0) 
							System.out.print("| Fine_vagone |");					
					}
					System.out.print(" " + primac[i]);
				}
				break;

			case 2: {
				System.out.println("quanti biglietti vuoi comprare?");
				int n2 = in.nextInt();
				som2 = som2 + n2;
				for (int i = 0; i < secondac.length; i++) {
					if(som2 > secondac.length) {
						System.out.println("Mi spiace il treno è pieno");
						break;
					}
					if (i < som2) 
						secondac[i] = "[X]";
					else 
						secondac[i] = "[ ]";		
				}

				System.out.println("SECONDA CLASSE");
				for (int i = 0; i < secondac.length; i++) {
					if (i != 0 && i % 20 == 0) 
						System.out.print("| Fine_vagone |");
					System.out.print(" " + secondac[i]);
				}
				break;
			}
			}
		} while (scelta == n1);
	}


	private static void esercizio3() {

		int [][] numeri= {{4,5},{6,7},{8,9},{10,3},{1,4},{5,8},{8,5},{4,5},{7,5},{4,5}};

		int c=0;
		int c2=0;

		for(int i=0;i<numeri.length;i++) {
			for(int j=0;j<numeri[j].length;j++) 
			{
				if(numeri[0][j]%2==0) {
					c++;}

				if(numeri[i][j]%2==0) {
					c2++;
				}
			}
		}

		if(c>c2) {
			for(int i=0;i<numeri.length;i++) {
				for(int j=0;j<1;j++) {
					System.out.print(numeri[i][j] );
				}
			}
		}
		if(c2>c) {
			for(int i=0;i<numeri.length;i++) {
				for(int j=1;j<2;j++) {
					System.out.print(numeri[i][j] );
				}
			}
		}				
	}


	}	
