package it.betacom.dpcreazionali;

public class Singleton {
	
	private static Singleton istanza;
	
	private Singleton() {

	}
	
	private static Singleton getInstance() {
		if(istanza == null) 
			istanza = new Singleton();
			return istanza;		
	}

}
