package it.betacom.esempi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	
	private final String[] ELEMENTI = { "1" ,"1","1","1","1","1","1" };
	private final String[] ELEMENTI2 = { "1" ,"1","1","1","1","1","1"};
	
	
	public LinkedListTest() {
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		for(String elemento: ELEMENTI)
			list1.add(elemento);
		for(String elemento: ELEMENTI2)
			list2.add(elemento);
		
		list1.offerFirst("Primo Elemento");
		System.out.println();
		list2.offerLast("Ultimo Elemento");
		System.out.println();
		list1.addAll(list2);
		list2 = null;
		
		stampaLista(list1);
		modifica(list1);
		stampaLista(list1);
		stampaReverse(list1);
		estrazioneSottolista(list1,4, 7);//7 non è compreso
	}


	private void stampaReverse(LinkedList<String> list1) {
		/*
		ListIterator<String> iterator = list1.listIterator(list1.size());
		while(iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.next());
			System.out.println();
		}
		*/
		Iterator<String> iterator2 = list1.descendingIterator();
		while(iterator2.hasNext()) {
			System.out.printf("%s ", iterator2.next());
			System.out.println();
		}
	}


	private void estrazioneSottolista(LinkedList<String> list1, int start, int end) {
		list1.subList(start, end).clear();
		
	}


	private void modifica(LinkedList<String> list1) {
		ListIterator<String> iterator = list1.listIterator();
		while(iterator.hasNext()) {
			String elemento = iterator.next();
			iterator.set(elemento.toLowerCase().trim());
		}
	}


	private void stampaLista(LinkedList<String> list1) {
		System.out.println("\nContenuto lista:");
		for(String elemento : list1)
			System.out.printf("%s " , elemento);
		System.out.println();		
	}
}


