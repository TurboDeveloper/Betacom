package it.betacom.dpcreazionali;

import java.util.HashMap;
import java.util.Map;

public class ProdottoLazy {
	
	private static Map<String, ProdottoLazy> tipi = 
			new HashMap<String, ProdottoLazy>();
	private String tipo;
	
	private ProdottoLazy(String tipo) {
		this.tipo = tipo;
		this.tipi.put(tipo, this);
	}

	public static ProdottoLazy getProdotto(String tipo) {
		ProdottoLazy prodotto;
		if(tipi.containsKey(tipo))
			prodotto = tipi.get(tipo);
		else
			prodotto = new ProdottoLazy(tipo);
		return prodotto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "ProdottoLazy [tipo=" + tipo + "]";
	}
	
	
	
}

