package it.betacom.dpcreazionali;

public class ConcreteBuilderFerrari extends AbstractBuilderAuto{

	@Override
	public void buildCilindrata() {
		a.setCilindrata("3000");
		
	}

	@Override
	public void buildModello() {
		a.setModello("TestaRossa");
		
	}
	
	
}
