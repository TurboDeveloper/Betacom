package it.betacom.esempi;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class CodaComparatorTest {
	
	public static void main(String[] args) {
		
		Queue<Integer> coda = new PriorityQueue<Integer>();
		//decidiamo noi l ordine di inserimento
		
		Random rand = new Random();
		for(int i = 0; i < 50; i++) {
			coda.offer(rand.nextInt(100));
		}
		
		for(int i = 0; i < 50; i++) {
			Integer dato = coda.poll();	
			System.out.println(dato);
		}
		System.out.println("La coda contiene" + coda) ;
		
		Queue<ImpiegatoQueue> codaComparator = new PriorityQueue<ImpiegatoQueue>(50, idComparator);
		aggiungi(codaComparator);
		rimuovi(codaComparator);
	}
	
	
	private static void rimuovi(Queue<ImpiegatoQueue> codaComparator) {
		while(true) {
			ImpiegatoQueue imp = codaComparator.poll();
			if(imp == null)
				break;
			System.out.println("Elimiato: " + imp);
		}
		
	}


	private static void aggiungi(Queue<ImpiegatoQueue> codaComparator) {
		Random rand = new Random();
		for(int i = 0; i < 50; i++) {
			int id = rand.nextInt(100);
			codaComparator.offer(new ImpiegatoQueue(id, "Impiegato " + id));
		}
		
	}


	public static Comparator<ImpiegatoQueue> idComparator = new Comparator<ImpiegatoQueue>() {
		
		@Override
		public int compare(ImpiegatoQueue i1, ImpiegatoQueue i2 ) {
			return i1.getId() - i2.getId();
		}
	};
}
