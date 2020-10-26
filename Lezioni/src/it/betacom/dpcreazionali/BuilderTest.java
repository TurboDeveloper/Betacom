package it.betacom.dpcreazionali;

public class BuilderTest {

	
	
	public static void main(String[] args) {
		
		AutoDirector dir = new AutoDirector();
		AbstractBuilderAuto ferrari = new ConcreteBuilderFerrari();
		AbstractBuilderAuto fiat = new  ConcreteBuilderFiat();
		
		
		dir.setaBuild(ferrari);
		dir.costruisciAuto();
		
		
	}
}
