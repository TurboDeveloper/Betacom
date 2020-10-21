package es.seconda.settimana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EsMartedi {
	
	private static Scanner in = new Scanner(System.in);
	private static int hashCodeSetteB;
	
	public static void main(String[] args) {
		chiedi();
	}


	private static void chiedi() {
		
		System.out.println("Che esercizio vuoi fare? ");
		int n1 = in.nextInt();
		if(n1 == 1) {
			System.out.println("SVOLGIMENTO ESERCIZIO 1");
			esercizio1();
		}else {
			System.out.println("SVOLGIMENTO ESERCIZIO 2");
			esercizio2();
		}
		
	}


	private static void esercizio1() {
		
		String [] semi = {"Cuori", "Picche", "Fiori", "Quadri"};
		ArrayList<Carta> mazzoCarte = new ArrayList<Carta>();

		
		for(String s: semi) {
			for(int j = 1; j <= 10; j++) {
				Carta c = new Carta(s, j);
				if( (c.getSeme().equals("Quadri")) && (c.getNumero() == 7)   )
					hashCodeSetteB = c.hashCode();
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
			String vincitore = "mimmo";
			Collections.shuffle(mazzoCarte);	
			manoP1 = mazzoCarte.subList(0, 10);
			for(Carta c : manoP1) 
				if(c.hashCode() == hashCodeSetteB)
					vincitore = "GIOCATORE 1";
			manoP2 = mazzoCarte.subList(10, 20);
			for(Carta c : manoP2)
				if(c.hashCode() == hashCodeSetteB)
					vincitore = "GIOCATORE 2";
			manoP3 = mazzoCarte.subList(20, 30);
			for(Carta c : manoP3)
				if(c.hashCode() == hashCodeSetteB)
					vincitore = "GIOCATORE 3";
			manoP4 = mazzoCarte.subList(30, 40);
			for(Carta c : manoP4)
				if(c.hashCode() == hashCodeSetteB)
					vincitore = "GIOCATORE 4";
			System.out.println("MANO GIOCATORE 1\n" + manoP1);
			System.out.println("MANO GIOCATORE 2\n" + manoP2);
			System.out.println("MANO GIOCATORE 3\n" + manoP3);
			System.out.println("MANO GIOCATORE 4\n" + manoP4);
			
			System.out.println("Il vincitore è: " + vincitore);
			System.out.println("Volete giocare ancora? ");
			altraMano = in.next().toUpperCase();
		}
		chiedi();
	}


	private static void esercizio2() {
		// TODO Auto-generated method stub
		
	}
}
