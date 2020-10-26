package it.betacom.dpstrutturali;

public class Facial {
	
	//singleton
	private static Facial istanza;
	
	private Facial() {}
	
	public static Facial getInstance() {
		if(istanza == null)
			istanza = new Facial();
		return istanza;
	}
	
	//singleton 
	
	public String getInfoBC1() {
		Business1 b1 = new Business1();
		return b1.getInfo();
	}
	
	public String getInfoBC2() {
		Business2 b1 = new Business2();
		return b1.getInfo();
	}
	
	public String getDescrizioneBC2() {
		Business2 b1 = new Business2();
		return b1.getDescrizione();
	}
	
	public String getInfoBC3() {
		Business3 b1 = new Business3();
		return b1.getInfo();
	}
}
