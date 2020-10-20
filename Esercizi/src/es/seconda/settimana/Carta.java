package es.seconda.settimana;

public class Carta {
	
	private String seme;
	private int numero;
	
	@Override
	public String toString() {
		return "[" + numero + " di " + seme + "]";
	}

	public String getSeme() {
		return seme;
	}

	public int getNumero() {
		return numero;
	}

	public Carta(String seme, int numero) {
		super();
		this.seme = seme;
		this.numero = numero;
	}
}
