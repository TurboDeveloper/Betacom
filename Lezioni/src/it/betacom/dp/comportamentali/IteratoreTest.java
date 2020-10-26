package it.betacom.dp.comportamentali;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratoreTest implements Iterable<Integer>{
	
	private int inizio,fine;


	public IteratoreTest(int inizio, int fine) {
		super();
		this.inizio = inizio;
		this.fine = fine;
	}


	@Override
	public Iterator<Integer> iterator() {

		return  new IntervalloIterator();
	}
	//innerClass
	private class IntervalloIterator implements Iterator<Integer> {
		private int cursore;

		public IntervalloIterator() {
			this.cursore=IteratoreTest.this.inizio;
		}

		public boolean hasNext() {
			return this.cursore<=IteratoreTest.this.fine;
		}
		public Integer next() {
			if(this.hasNext()) {
				int valCorrenteCollection=this.cursore;
				cursore++;
				return valCorrenteCollection;
			}
			throw new NoSuchElementException(); // è l'eccezione che va gestita se non ci son piu elementi
		}
	}

	public static void main(String[] args) {
		IteratoreTest intervallo= new IteratoreTest(1,10);

		Iterator<Integer>iteratore=intervallo.iterator();
		while(iteratore.hasNext()) {
			int cursore=iteratore.next();	
			System.out.println(cursore);
			}
		
	}
}
