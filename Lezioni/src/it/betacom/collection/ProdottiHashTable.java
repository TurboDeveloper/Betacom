package it.betacom.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class ProdottiHashTable {
	
	private Hashtable<String,String[]>prodotti=new Hashtable<String,String[]>();
	private int numeroArticoli;
	

	public int getNumeroArticoli() {
		return numeroArticoli;
	}

	public void setNumeroArticoli(int numeroArticoli) {
		this.numeroArticoli = numeroArticoli;
	}

	public ProdottiHashTable() {
		numeroArticoli=0;
	}

	public void aggiungiProdotto(String cod,String marca,String modello,double prezzo) {
		String[] dati= {marca,modello,Double.toString(prezzo),"1",cod};
		numeroArticoli++;
		if(prodotti.containsKey(cod)) {// se il prodotto è già nella mappa, incremento la quantita
			String[] datiModifica=prodotti.get(cod);
			int quantita=Integer.parseInt(datiModifica[3]); //prendo la quantità
			quantita++;// la aumento
			datiModifica[3]=Integer.toString(quantita);//inserisco nel vettore per modificare il nuovo valore
			prodotti.put(cod,datiModifica);// inserisco nella mappa il nuovo valore
			// il put oltre ad aggiungere, modifica i dati se la chiave esiste già

		}else {
			prodotti.put(cod, dati);
		}
	}

	public void rimuoviProdotto(String cod) {
		if(prodotti.containsKey(cod));{
			numeroArticoli--;
			String[] datiModifica=prodotti.get(cod);
			if(Integer.parseInt(datiModifica[3])==1) {
				prodotti.remove(cod);
			}else {
				int quantita=Integer.parseInt(datiModifica[3]);
				quantita--;
				datiModifica[3]=Integer.toString(quantita);
				prodotti.put(cod,datiModifica);
			}
		}


	}
	public double totaleComplessivo() {
		double totale=0.00;
		Enumeration<String[]> elementi=prodotti.elements();
		String[] dati;
		while(elementi.hasMoreElements()) {
			dati=elementi.nextElement();
			totale+=Double.parseDouble(dati[2])*(Integer.parseInt(dati[3]));
		}
		return totale;
	}

	public double totaleParziale(String cod) {
		double totale=0.00;
		String[] dati=prodotti.get(cod);
		totale+=Double.parseDouble(dati[2])*(Integer.parseInt(dati[3]));
		return totale;
	}
	
	public Enumeration <String[]> listaProdotti(){
		return prodotti.elements();
	}
}
