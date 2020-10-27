package es.primasettimana;

public class Ordine {
	
	private int numero;
    private Prodotto[] prodotti= new Prodotto[5];
    private int i=0;
	public Ordine(int numero) {
		
		this.numero = numero;
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Prodotto[] getProdotti() {
		return prodotti;
	}
	public void setProdotti(Prodotto p) {
		for(int j=0;i<prodotti.length;i++) {
			if(prodotti[i]==null)
				prodotti[i]=p;
			i++;
			
			break;
		}
	}

	private String stampaProdotti() {
		String stampa="";
		for(Prodotto p:prodotti) {
			if(p!=null)
			stampa+= p.toString() +"\n";
		}
		return stampa;
	}
	
	public int totale() {
		int tot=0;
		
		for(Prodotto p:prodotti) {
			if(p!=null)
				tot+=p.getPrezzo();
		}
		return tot;
	}
	
	@Override
	public String toString() {
		return "Ordine numero " + numero + "\nprodotti: " + stampaProdotti() ;
	}
}
