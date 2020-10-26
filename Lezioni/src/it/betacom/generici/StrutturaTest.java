package it.betacom.generici;

public class StrutturaTest {
	
	private static Integer[] e1 = {1,2,3,4,5,6,7,8,9,10,11};
	private static Double[] eD = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
	
	private static StrutturaDati<Integer> sI;
	
	private static StrutturaDati<Double> sD;
	
	public static void main(String[] args) {
		sI= new StrutturaDati<Integer>(10);
		sD = new StrutturaDati<Double>(4);
		
		testPush(sI, e1);
		testPush(sD, eD);
		
		testPop(sI);
		testPop(sD);
	}

	public static<T> void testPush(StrutturaDati<T> st, T[] ar) {
		try {
			for(T ele : ar) {
				System.out.printf("%s ", ele);
				st.push(ele);
			}
		}catch(RuntimeException exc) {
			System.out.println(exc.getMessage());
			exc.printStackTrace();
		}
	}
	
	public static<T> void testPop(StrutturaDati<T> st) {
		try {
			T valore; 
			while(true) {
				valore = st.pop();
				System.out.println("valore: "+valore);
			}
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
