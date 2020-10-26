package it.betacom.esempi;

import java.util.Scanner;

public class Esempio {
	
	static int x=1;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
	/*	Trimestre.stampa();
		Trimestre t1 = Trimestre.FEBBRAIO;
		System.out.println(t1.ordinal());
		System.out.println(t1.name());
		
		int x = 5;
		System.out.println("variabile: "+x);
		metodoA();
		metodoB();
		metodoA();
		metodoB();
		
	}
	
	private static void metodoA() {
		int x = 25;
		System.out.println("variabile dopo metodo A: "+x);
		++x;
		System.out.println("variabile prima di uscire metodo A: "+x);
	}

	private static void metodoB() {
		System.out.println("variabile dopo metodo B: "+x);
		x*=10;
		System.out.println("variabile prima di uscire metodo B: "+x);
		
	} 

	public enum Trimestre{
		GENNAIO, FEBBRAIO, MARZO;
		
		public static void stampa() {
			for(Trimestre t : Trimestre.values()) {
				System.out.println(t);
			}
				
		}*/
		
		
		double previsione = in.nextDouble();
		double pagamenti = in.nextDouble();
		double tassoInteresse = in.nextDouble();
		
		double bilancio = 0;
		int anni = 0;
		while(bilancio < previsione) {
			bilancio += pagamenti;
			double interessi = bilancio * tassoInteresse/100;
			bilancio += interessi;
			anni++;
		}
	}
}

