package es.prima.settimana;

import java.util.Arrays;

public class Studente2 implements Comparable<Studente2> {

	@Override
	public int compareTo(Studente2 o) {
		int diffmedie = this.getMedia() - o.getMedia();
		if(diffmedie != 0)
			return diffmedie;	
		return 0;
	}
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", media=" + media + ", voti=" + Arrays.toString(voti) + "]";
	}
	public Studente2(String nome, int media, String[] voti) {
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
