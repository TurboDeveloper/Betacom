package it.betacom.generici;

public class GenericTest {
	

	public static void main(String[] args) {
		
		Integer[] i = {1, 2, 3, 4, 5, 6};
		Double [] d = {1.1, 2.0, 3.0, 4.0, 5.0};
		String [] s = {"1", "2", "3", "4", "5"};
		
		stampa(i);
		stampa(d);
		stampa(s);
		//errato perche stesso metodo ma con tipi diversi @overloding
		stampaG(i);
		stampaG(d);
		stampaG(s);
		
		//ArrayList<?>
		//HashSetSet<?,?>
	}
	
	private static void stampa(Integer [] i) {
		for(Integer vI : i)
			System.out.println(vI + " ");
	}
	
	private static void stampa(Double [] i) {
		for(Double vI : i)
			System.out.println(vI + " ");
	}
	
	private static void stampa(String [] i) {
		for(String vI : i)
			System.out.println(vI + " ");
	}
	
	//? per i metodi, E per i parametri
	private static <E> void stampaG(E[] i) {
		for(E eI: i)
			System.out.println(eI + " ");
	}
	
}
