package it.betacom.thread.gestione;

public class Thread1 extends Thread {
	
	Struttura s;
	
	

	public Thread1(Struttura s) { 
		this.s = s;
	}



	@Override
	public void run() { // dentro qui uso s per richiamare il metodo elabora
		s.elabora(10);
	}
	
	

}
