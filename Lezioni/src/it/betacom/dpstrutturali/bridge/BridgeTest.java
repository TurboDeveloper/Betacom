package it.betacom.dpstrutturali.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Automobile ferrari = new Ferrari(new ColoreRosso());
		Automobile fiat = new Fiat(new ColoreRosso());
		ferrari.verniciaAuto();
		fiat.verniciaAuto();
	}
}
