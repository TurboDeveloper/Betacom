package it.betacom.thread.gestione;

public class BilancioWait {
	private double bilancio = 10000;

	synchronized void prelevaCifra(double cifra) {
		if (this.bilancio < cifra) {
			System.out.println("bilancio insufficente! DEPOSITSA QUALCOSA..........CAZZO!");
			try {
				wait();
			} catch (Exception e) {
				e.getMessage();
			}
			this.bilancio -= cifra;
			System.out.println("prelevato " + cifra + " bilancio attuale " + bilancio);
		}
	}

	synchronized void depositaCifra(double cifra) {
		System.out.println("Deposito : " + cifra);
		this.bilancio += cifra;
		System.out.println("bilancio attuale " + bilancio);
		notify(); // risveglio il thread di prima
	}

}
