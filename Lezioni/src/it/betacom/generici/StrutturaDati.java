package it.betacom.generici;

public class StrutturaDati<T> {

	private int dimensione;
	private int top;
	private T[] elementi;
	
	public StrutturaDati() {
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	public StrutturaDati(int dim) {
		dimensione = dim > 0 ? dim : 10; // se dim è maggiore di 0 allora dim se no 10
		top = -1;
		elementi = (T[]) new Object[dimensione]; // non posso controllare il casting 
	}
	
	// T lo posso usare come tipo ma non come isanza
	public void push(T valore) {
		if(top == dimensione - 1)
			throw new RuntimeException("Struttura piena");
		elementi[++top] = valore;
	}
		
	public T pop() {
		if(top == -1)
			throw new RuntimeException("Struttura vuota");
		return elementi[top --];
	}
}
