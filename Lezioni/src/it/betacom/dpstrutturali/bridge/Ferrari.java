package it.betacom.dpstrutturali.bridge;

public class Ferrari extends Automobile{

	public Ferrari(Colore colore) {
		super(colore);
	}

	@Override
	public void verniciaAuto() {
		System.out.println(this.getClass().getSimpleName());
		colore.verniciaAuto();
	}
	
}
