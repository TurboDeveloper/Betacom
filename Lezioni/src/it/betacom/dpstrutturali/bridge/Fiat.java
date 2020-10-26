package it.betacom.dpstrutturali.bridge;

public class Fiat extends Automobile{

	public Fiat(Colore colore) {
		super(colore);
	}

	@Override
	public void verniciaAuto() {
		System.out.println(this.getClass().getSimpleName());
		colore.verniciaAuto();
	}
	
}
