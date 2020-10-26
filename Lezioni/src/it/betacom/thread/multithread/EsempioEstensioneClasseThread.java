package it.betacom.thread.multithread;

public class EsempioEstensioneClasseThread extends Thread{

	// se estendo thread, e quindi non vado ad usare il trhead base del main
	// devo sovrascrivere il metodo run

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(" valore di i: " + i);
				Thread.sleep(2000);
				}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}// qui diamo quanti millisecondi deve star fermo il thread
	}

}




