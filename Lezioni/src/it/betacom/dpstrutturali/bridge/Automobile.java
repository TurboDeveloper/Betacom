package it.betacom.dpstrutturali.bridge;

public abstract class Automobile {
	Colore colore;
	//non implemento interfaccia "colore"
	//ma metto attributo
	
	public Automobile(Colore colore) {
		this.colore = colore;
	}
	
	public abstract void verniciaAuto();
}
