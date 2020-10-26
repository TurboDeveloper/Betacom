package it.betacom.dp.strutturali.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Prodotto prodotto = new Prodotto("p1");
		Prodotto prodotto2 = new Prodotto("p2");
		
		prodotto.calcolo();
		prodotto2.calcolo();
		prodotto2.calcolo(); // loading non necessario perche eseguito in precedenza
	}
}
