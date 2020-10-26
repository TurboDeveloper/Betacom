package it.betacom.dpcreazionali;

public class ConcreteBuilderFiat extends AbstractBuilderAuto {
	
	@Override
	public void buildCilindrata() {
		a.setCilindrata("1000");
		
	}

	@Override
	public void buildModello() {
		a.setModello("Punto");
		
	}
}
