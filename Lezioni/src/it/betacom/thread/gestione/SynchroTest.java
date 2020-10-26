package it.betacom.thread.gestione;

public class SynchroTest {

	public static void main(String[] args) {
	  Struttura s= new Struttura();
	  
	  Thread1 t1= new Thread1(s); // posso istanziarli perchè estendono la classe Thread
	  Thread2 t2= new Thread2(s);

	  
	  // impostando la priorità dovrebbe far partire quello con la priorità piu alta
	  
	  t1.setPriority(10);
	  t2.setPriority(1);
	  t1.start();
	  t2.start();
	  

	}

}
