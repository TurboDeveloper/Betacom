package it.betacom.esempi;

public class ImpiegatoTest {
	
	public static void main(String[] args) {
		
		Impiegato i1 = new Impiegato(1, "Mimmo", 2000);
		Impiegato i2 = new Impiegato(2, "luigi", 1000);
		Impiegato i3 = new Impiegato(3, "ciao", 5000);
		
		Impiegato[] impiegati = new Impiegato[3];
		impiegati[0] = i1;
		impiegati[1] = i2;
		impiegati[2] = i3;
		System.out.println("Conteggio impiegati" + Impiegato.getConteggio());
	}
}
