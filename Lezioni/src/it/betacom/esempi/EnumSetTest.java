package it.betacom.esempi;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetTest {
	
	public static void main(String[] args) {
		
		Set<Mesi> trimestre = EnumSet.of(Mesi.GENNAIO, Mesi.FEBBRAIO, Mesi.MARZO);
		stampaSet(trimestre);
		
		//istanzio ma non lo popolo
		Set<Mesi> trimestreVuoto = EnumSet.noneOf(Mesi.class);
		trimestreVuoto.add(Mesi.OTTOBRE);
		trimestreVuoto.add(Mesi.NOVEMBRE);
		trimestreVuoto.add(Mesi.DICEMBRE);
		
		//posso metterli tutti nel set e dicidere
		Set<Mesi> trimestreAll = EnumSet.allOf(Mesi.class);
		stampaSet(trimestreAll);
	}
	
	
	private static void stampaSet(Set<Mesi> m) {
		for(Mesi mese : m) {
			System.out.println(mese + " ");
		}
		
	}


	private enum Mesi{
		GENNAIO,FEBBRAIO,MARZO,APRILE,MAGGIO,GIUGNO,LUGLIO,AGOSTO,SETTEMBRE,
		OTTOBRE,NOVEMBRE,DICEMBRE;
	}
	
}
