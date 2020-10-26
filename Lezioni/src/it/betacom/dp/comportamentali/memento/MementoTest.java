package it.betacom.dp.comportamentali.memento;

public class MementoTest {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setStato("Primo stato");
		originator.setStato("Secondo stato");
		careTaker.add(originator.salvaStatoMemento());
		
		originator.setStato("terzo stato");
		careTaker.add(originator.salvaStatoMemento());
		originator.setStato("quarto satato");
		
		System.out.println("stato corrente : "+ originator.getStato());
		originator.getStatoMemento(careTaker.get(0));
		System.out.println("primo stato salvato: "+ originator.getStato() );
		originator.getStatoMemento(careTaker.get(1));
		System.out.println("secondo stato salvato: "+ originator.getStato() );

	}
}
