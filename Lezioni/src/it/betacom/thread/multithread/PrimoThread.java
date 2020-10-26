package it.betacom.thread.multithread;

public class PrimoThread {

	public static void main(String[] args) { // con la classe main, sicuramente ho un thread, lanciato da main
		Thread t = Thread.currentThread(); // così posso prendere il thread corrente
		t.setName("Main Thread");// da nome ai thread è utile per poterli recuperare,
		// soprattutto quando ne abbiam piu d'uno
		t.setPriority(10); // qui settiamo la priorità da 1 a 10, ove 10 è il massimo
		System.out.println(t);
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(" valore di i: " + i);
				Thread.sleep(2000);// qui diamo quanti millisecondi deve star fermo il thread
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
