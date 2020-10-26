package it.betacom.esempi;

import java.util.Random;
import java.util.Scanner;

public class EserciziPrimoGiorno {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		//stampa100();
		//calcolaMCD();
		lanciaDadi();
		
	}

	private static void lanciaDadi() {
		
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

	private static void calcolaMCD() {
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
	      if (n1 > n2) // pongo i > j
	      {
	         i = n1;
	         j = n2;
	      }

	      // Algoritmo di Euclide
	      int tmpInt;
	      while ((tmpInt = i % j) != 0)
	      {
	         i = j;
	         j = tmpInt;
	      }
	      
	      // Stampa su output standard
	      System.out.println("MCD(" + n1 + "," + n2 + ") = " + j);
		
		
	}

	private static void stampa100() {
		
		for(int i=0; i<101; i++) {
			System.out.println("Numero:" + i);
		}
		
	}
	
}
