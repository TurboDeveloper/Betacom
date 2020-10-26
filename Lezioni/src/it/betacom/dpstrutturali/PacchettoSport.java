package it.betacom.dpstrutturali;

public class PacchettoSport extends AutoDecorator{

	//costruice l auto di  base quando decidiamo quale istanziare
	public PacchettoSport(Automobile auto) {
		super(auto);
	}

	@Override
	public void assembla() {
		super.assembla();
		System.out.println("aggiunto il pacchetto sport");
	}
	
	
}
