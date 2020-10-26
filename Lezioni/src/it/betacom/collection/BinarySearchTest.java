package it.betacom.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
	
	private static final String [] ELEMENTI = {"E1", "E2", "E3","E4", "E5", "E6"};
	private List<String> list;
	
	public BinarySearchTest() {
		
		list = new ArrayList<String>(Arrays.asList(ELEMENTI));
		Collections.sort(list);
		System.out.printf("%s ", list);		
	}
	
	private void search() {
		ricerca(ELEMENTI[3]);
		ricerca(ELEMENTI[0]);
		ricerca(ELEMENTI[2]);
		ricerca("E4");
		ricerca("E7");
		ricerca("E9");
	}
	
	private void ricerca(String key) {
		int risultato = 0;
		risultato = Collections.binarySearch(list, key);
		if(risultato >= 0)
			System.out.printf("Trovato valore, Indice: %d\n",risultato);
		else
			System.out.printf("No Trovato valore, Indice: %d\n",risultato);
		//POSSIBILI INDICI DOVE IL PC SI ASPETTAVA DI TROVARE IL VALORE
	}
	
	public static void main(String[] args) {
		BinarySearchTest test = new BinarySearchTest();
		test.search();
	}
}
