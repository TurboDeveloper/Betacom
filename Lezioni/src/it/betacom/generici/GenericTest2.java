package it.betacom.generici;

public class GenericTest2 {
	
	public static void main(String[] args) {
		System.out.println(max(3,5,9));
		System.out.println(max(3.0,5.0,9.0));
		System.out.println(max("e1","e2","e3"));
	
	}
	
	
	//dove utilizzare un interfaccia per utilizzare comparable
	// T : l elemento classe
	//parametro passato in ingresso deve essere un oggetto
	//il metodo utilizza oggeto di tipo ti che estende comparable che a suoa volta prende in ingresso dati generici
	
	private static <T extends Comparable<T>> T max(T i, T j, T k) {
		T max = i;
		if(j.compareTo(max) > 0)
			max = j;
		if(k.compareTo(max) > 0)
			max = k;
		return max;
				
	}
}
