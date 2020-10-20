package es.prima.settimana;

import java.util.Random;
import java.util.Scanner;

/*	
 * ESERCIZIO 1: 
 * ***************************************************************************************
 * Scrivere un programma che stampa i numeri primi minori di 100
 *  
 *  ESERCIZIO 2:
 *  *************************************************************************************** 
 *  Scrivere un programma che calcola il MCD di due numeri positivi immessi attraverso Scanner.
 *  
 *	ESERCIZIO 3: 
 *	***************************************************************************************
 *	Ogni giocatore lancia due dadi.
 *			Se la somma al primo tiro è 7 o 11 il giocatore ha vinto.
 *			Se la somma al primo tiro è 2,3 o 12 il giocatore ha perso.
 *			Se la somma al primo tiro è 4,5,6,8,9 o 10 questa somma diventa il punteggio.
 *	   Per vincere è necessario continuare a tirare i dati finchè non si totalizza il punteggio realizzato con il primo tiro.
 *	   Il giocatore perde se totalizza 7 prima di raggiungere il punteggio del primo tiro.
 *	
 *	ESERCIZIO 4: 
 *	***************************************************************************************
 *	Scrivere un programma che calcoli il valore negativo in binario dato un intero unsigned.
 */

public class EsLunedi {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Che esercizio vuoi fare? ");
		int n1 = in.nextInt();
		switch(n1) {
		case 1: stampa100();
		break;
		case 2: calcolaMCD();
		break;
		default: lanciaDadi();	
		}
	}

	private static void stampa100() {
		
		//scrivere i numeri primi minori di 100
				int i;
				int num = 0;
				int massimo = 100; 
				boolean primo = true;
				String numeriPrimi = "";

				for (i = 1; i <= massimo; i++) {
					primo = CheckPrime(i);
					if (primo) {
						numeriPrimi = numeriPrimi + i + " ";
					}
				}
				System.out.println("i numeri primi da 1 a " + massimo + " sono:\n" + numeriPrimi);		
	}
	
	
	private static void calcolaMCD() {
		
		System.out.println();
		System.out.println("ESERCIZIO 2");
		int n1 = 0,n2 = 0, mcd = 0;		
		do {
			System.out.println("Inserisci un numero positivo:");
			n1 = in.nextInt();
			if(n1<0)
				System.out.println("Errore: Numero non valido");
		}while(n1<0);	
		
		do {
			System.out.println("Inserisci un numero positivo:");
			n2 = in.nextInt();
			if(n2<0)
				System.out.println("Errore: Numero non valido");
		}while(n2<0);
		
		int i = n1;
	      int j = n2;
	      if (n1 > n2) { // pongo i > j
	         i = n1;
	         j = n2;
	      }

	      //Euclide
	      int tmpInt;
	      while ((tmpInt = i % j) != 0){
	         i = j;
	         j = tmpInt;
	      }      
	      System.out.println("MCD(" + n1 + "," + n2 + ") = " + j);	
	}
	
	
	private static void lanciaDadi() {
		
		System.out.println();
		System.out.println("ESERCIZIO 3");
		
		Random rand = new Random();
		int first = 0, rand1 = 0, rand2 = 0, current = 0;
		boolean win = false, firstShot = true;
		String result = "perso";
		do {
		rand1 = rand.nextInt(5) + 1;
		System.out.println("numero1:"+ rand1);
		rand2 = rand.nextInt(5) + 1;
		System.out.println("numero2:"+ rand2);
		
		current = rand1 + rand2;
		System.out.println("current:"+ current);
		
		if(firstShot && (current == 7 || current == 11)) {
			firstShot = false;
			win = true;
			result = "vinto";
			break;
		}else if (current == 2 || current == 3 || current == 12) {
			break;
		}else if(current == 4 || current == 5 || current == 6 || current == 8 || current == 9 || current == 10) {
			first = current;
			firstShot = false;
		}
		
		if(current == 7) {
			break;
		}
		if(first == current) {
			win = true;
			result = "vinto";
		}
		
		}while(!win);
		
		while(!win) {
			
			rand1 = rand.nextInt(5) + 1;
			System.out.println("numero1:"+ rand1);
			rand2 = rand.nextInt(5) + 1;
			System.out.println("numero2:"+ rand2);
			
			current = rand1 + rand2;
			System.out.println("current:"+ current);
			
			if(firstShot) {
				switch(current) {
				
				case 7,11: 
					win = true;
					result = "vinto";
					break;
				
				}
			}
		}
		
		System.out.println("first:"+ first);
		System.out.println("Il giocatore ha:"+ result);
	}
	
	public static boolean CheckPrime(int numToCheck) {
		int rem;
		for (int i = 2; i <= numToCheck / 2; i++) {
			rem = numToCheck % i;
			if (rem == 0) {
				return false;
			}
		}
		return true;
	}
}
