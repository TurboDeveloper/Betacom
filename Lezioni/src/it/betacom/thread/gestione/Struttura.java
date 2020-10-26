package it.betacom.thread.gestione;



public class Struttura {
	synchronized void  elabora(int n) { // voglio richiamare questo metoto con piu thread
		                                // il synchronized mi permette di terminare un thread al 100% 
		                                // prima che inizi il secodno
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);// calcolo a caso
		}//for
		try {
			Thread.sleep(2000);// questo è il thread main
		}catch(InterruptedException e) {
			e.getMessage();
		}
	}

}
