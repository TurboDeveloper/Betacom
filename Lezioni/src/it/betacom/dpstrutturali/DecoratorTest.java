package it.betacom.dpstrutturali;

public class DecoratorTest {

	public static void main(String[] args) {
		Automobile autoPL = new PacchettoLusso(new AutoBase());
		autoPL.assembla();
		
		System.out.println();
		
		Automobile autoPS = new PacchettoSport(new AutoBase());
		autoPS.assembla();
	}
}
