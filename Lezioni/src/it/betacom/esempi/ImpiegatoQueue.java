package it.betacom.esempi;

public class ImpiegatoQueue {
	
	private int id;
	private String nome;
	
	public ImpiegatoQueue(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "ImpiegatoQueue [id=" + id + ", nome=" + nome + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
