package es.prima.settimana;

public class Prodotto {
	
	private String nome;
	private int prezzo;
	public Prodotto(String nome, int prezzo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
	}



	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}





	@Override
	public String toString() {
		return nome + " " + prezzo + "€";
	}
}
