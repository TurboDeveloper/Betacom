package es.seconda.settimana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EsMartedi {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Che esercizio vuoi fare? ");
		int n1 = in.nextInt();
		if(n1 == 1) {
			esercizio1();
			System.out.println("SVOLGIMENTO ESERCIZIO 1");
		}else {
			esercizio2();
			System.out.println("SVOLGIMENTO ESERCIZIO 2");

		}
		
	}


	private static void esercizio1() {
		
		String [] semi = {"Cuori", "Picche", "Fiori", "Quadri"};
		ArrayList<Carta> mazzoCarte = new ArrayList<Carta>();
		
		for(String s: semi) {
			for(int j = 1; j <= 10; j++) {
				Carta c = new Carta(s, j);
				mazzoCarte.add(c);
			}
		}
		gioca(mazzoCarte);
	}
	
	
	private static void gioca(ArrayList<Carta> mazzoCarte) {
		String altraMano = "SI";
		List<Carta> manoP1 = new ArrayList<Carta>();
		List<Carta> manoP2 = new ArrayList<Carta>();
		List<Carta> manoP3 = new ArrayList<Carta>();
		List<Carta> manoP4 = new ArrayList<Carta>();
		
		while(altraMano.equals("SI")) {
			String vincitore = "";
			Collections.shuffle(mazzoCarte);			
			manoP1 = mazzoCarte.subList(0, 10);
			if(manoP1.contains(new Carta("Quadri", 7)))
				vincitore = "GIOCATORE 1";
			manoP2 = mazzoCarte.subList(10, 20);
			if(manoP2.contains(new Carta("Quadri", 7)))
				vincitore = "GIOCATORE 2";
			manoP3 = mazzoCarte.subList(20, 30);
			if(manoP3.contains(new Carta("Quadri", 7)))
				vincitore = "GIOCATORE 3";
			manoP4 = mazzoCarte.subList(30, 40);
			if(manoP4.contains(new Carta("Quadri", 7)))
				vincitore = "GIOCATORE 4";
			System.out.println("MANO GIOCATORE 1\n" + manoP1);
			System.out.println("MANO GIOCATORE 2\n" + manoP2);
			System.out.println("MANO GIOCATORE 3\n" + manoP3);
			System.out.println("MANO GIOCATORE 4\n" + manoP4);
			
			System.out.println("Il vincitore è: " + vincitore);
			System.out.println("Volete giocare ancora? ");
			altraMano = in.next();
		}
		
	}


	private static void esercizio2() {
		// TODO Auto-generated method stub
		
	}
}
