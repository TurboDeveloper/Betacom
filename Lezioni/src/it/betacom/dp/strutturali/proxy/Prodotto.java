package it.betacom.dp.strutturali.proxy;

public class Prodotto implements ProdottoAbstract {

	private String parametro;
	public Prodotto(String parametro) {
		this.parametro = parametro;
		calcolo();
	}
	
	@Override
	public void calcolo() {
		System.out.println("CALCOLO PESANTE");
		
	}

	public String getParametro() {
		return parametro;
	}
	
}
