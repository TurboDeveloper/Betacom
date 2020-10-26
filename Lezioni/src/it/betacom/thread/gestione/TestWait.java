package it.betacom.thread.gestione;

public class TestWait {
	public static void main(String[] args) {
		BilancioWait b= new BilancioWait();
		
		new Thread() { // istanza anonima di thread, si può fare con tutte le classi in linea di massima
			public void run() {
				b.prelevaCifra(18000);
			}
		}.start();// startiamo il thread
		
		new Thread() { // istanza anonima di thread, si può fare con tutte le classi in linea di massima
			public void run() {
				b.depositaCifra(20000);
			}
		}.start();// startiam
		
	}

}
