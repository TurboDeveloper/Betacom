package it.betacom.dpstrutturali;

public class PacchettoLusso extends AutoDecorator{

	//costruice l auto di  base quando decidiamo quale istanziare
	public PacchettoLusso(Automobile auto) {
		super(auto);
	}

	@Override
	public void assembla() {
		super.assembla();
		System.out.println("aggiunto il pacchetto lusso");
	}
	
	
}
