package it.betacom.dpcreazionali;

public abstract class AbstractBuilderAuto {
	
	protected Auto a;
	
	public Auto getAuto() {
		return a;
	}
	
	public abstract void buildCilindrata();
	public abstract void buildModello();
	
	public void createNewAutoBuiler() {
		a = new Auto();
	}
	
}
