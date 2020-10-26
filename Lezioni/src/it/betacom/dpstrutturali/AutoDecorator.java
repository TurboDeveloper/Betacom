package it.betacom.dpstrutturali;

public class AutoDecorator implements Automobile{
	Automobile auto;
	
	//REGOLA(argomento base) // FULCRO DP
	public AutoDecorator(Automobile auto) {
		this.auto = auto;
	}
	@Override
	public void assembla() {
		this.auto.assembla();	
	}

	
}
