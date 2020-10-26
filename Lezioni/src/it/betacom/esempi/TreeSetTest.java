package it.betacom.esempi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetTest {
	
	private static final String[] ELEMENTI = {"E1", "E2", "E1", "E1" };
	
	public TreeSetTest() {
		List<String> lista = Arrays.asList(ELEMENTI);
		System.out.printf("%s ", lista);
		
		TreeSet<String> set = new TreeSet<String>(lista);
		
		ArrayList<String> lista2 = new ArrayList<String>(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.printf("%s ", it.next());
		}
		
	}
	
	public static void main(String[] args) {
		new TreeSetTest();
	}
	
} 
