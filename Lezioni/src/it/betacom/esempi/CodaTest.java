package it.betacom.esempi;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class CodaTest {
	
	public static void main(String []args) {
		
		Queue<String> coda = new LinkedList<String>();
		coda.offer("B");
		coda.offer("A");
		coda.offer("C");
		coda.offer("D");
		coda.offer("M");
		System.out.printf("CONTENUTO CODA %s ", coda );
		coda.clear();
		coda.offer("A");
		coda.remove();
		try {
			coda.remove();
		}catch(NoSuchElementException exc) {
			//coda.poll();
			System.out.println("coda vuota");
		}
		
		/*
		Queue<String> coda = new PriorityQueue<String>();
		coda.offer("B");
		coda.offer("A");
		coda.offer("C");
		coda.offer("D");
		coda.offer("M");
		System.out.printf("CONTENUTO CODA %s ", coda );
		coda.clear();
		coda.offer("A");
		coda.remove();
		try {
			coda.remove();
		}catch(NoSuchElementException exc) {
			//coda.poll();
			System.out.println("coda vuota");
		}
		*/
	}
}
