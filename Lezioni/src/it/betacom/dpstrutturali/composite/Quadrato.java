package it.betacom.dpstrutturali.composite;

public class Quadrato implements Forma{

	@Override
	public void disegna(String colore) {
		System.out.println(this.getClass().getSimpleName() + " : "+ colore);
	}
	
}
