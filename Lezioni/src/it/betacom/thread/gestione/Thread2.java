package it.betacom.thread.gestione;

public class Thread2 extends Thread {
	
	Struttura s;
	
	

	public Thread2(Struttura s) { 
		this.s = s;
	}



	@Override
	public void run() { // dentro qui uso s per richiamare il metodo elabora
		s.elabora(1000);
	}
	
	

}
