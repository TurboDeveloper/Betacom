package es.primasettimana;

public class Cliente {
	
	private String nome;
	private int i=0;

	private Ordine[] ordini=new Ordine[5];

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Ordine[] getOrdini() {
		return ordini;
	}


	public void setOrdini(Ordine o) {
		for(int j=0;i<ordini.length;j++) {
			if(ordini[i]==null)
				ordini[i]=o;
			i++;
			break;
		}
	}
	
	private String stampaOrdini() {
		String stampa="";
		for(Ordine o:ordini) {
			if(o!=null)
			 stampa+= o.toString() +"\n";
		}
		return stampa;
	}

	@Override
	public String toString() {
		return "Cliente " + nome + " ordini : " + stampaOrdini() ;
	}
}
