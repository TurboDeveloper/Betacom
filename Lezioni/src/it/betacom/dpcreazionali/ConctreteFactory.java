package it.betacom.dpcreazionali;

public class ConctreteFactory extends AbstractFactory {
	
	@Override
	public AbstractFactory createAbstract() {
		return new ConctreteFactory();
	}
	
}
