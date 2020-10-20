package es.prima.settimana;

import java.util.Arrays;

public class Studente {
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", media=" + media + ", voti=" + Arrays.toString(voti) + "]";
	}
	public Studente(String nome, int media, String[] voti) {
		super();
		this.nome = nome;
		this.media = media;
		this.voti = voti;
	}
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
	public String[] getVoti() {
		return voti;
	}
	public void setVoti(String[] voti) {
		this.voti = voti;
	}
	private int media;
	private String [] voti;

}
