package it.betacom.dp.strutturali.proxy;

public class ProxyProdotto implements ProdottoAbstract{
	private String parametro;
	private Prodotto prodotto;
	
	public ProxyProdotto(String parametro) {
		this.parametro = parametro;	
	}
	
	@Override
	public void calcolo() {
		if(prodotto == null) {
			prodotto = new Prodotto(parametro);
		}
		prodotto.calcolo();
		
	}
	
}
