package it.betacom.dp.comportamentali.memento;

public class Originator {
	 private String stato;
	 
	 public void setStato(String stato) {
		 this.stato = stato;
	 }
	 
	 public String getStato() {
		 return stato;
	 }
	 
	 public Memento salvaStatoMemento() {
		 return new Memento(stato);
	 }
	 
	 public void getStatoMemento(Memento mem) {
		 stato = mem.getStato();
	 }
	 
	 
}
