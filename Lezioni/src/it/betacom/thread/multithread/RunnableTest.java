package it.betacom.thread.multithread;

public class RunnableTest implements Runnable{
	public static void main(String[] args) {
		new RunnableTest();
	}
	
	public RunnableTest() {
		Thread tCorrente= Thread.currentThread();
		tCorrente.setName("Thread principale");
		
		Thread creatoDaNoi= new Thread(this,"thread figio");//questo this si riferisce all'istanza corrente
		                                                 // crea un thread figlio rispetto a quello principale;
		creatoDaNoi.start();// questo metodo richiama il metodo run
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.getMessage();
		}
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(" valore di i: " + i);
				Thread.sleep(2000);
				}
		} catch (InterruptedException e) {
			e.getMessage();
		}
		
	}

}
