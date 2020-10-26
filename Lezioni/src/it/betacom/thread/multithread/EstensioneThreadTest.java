package it.betacom.thread.multithread;

public class EstensioneThreadTest {
	public static void main(String[] args) {


		EsempioEstensioneClasseThread t = new EsempioEstensioneClasseThread();
		// se già ho piu thread, posso crearmi istanze di thread che fan cose dirrenti, e potrei metteli tutti in start
		// terminano quando han finito di fare quel che devono 
		// poi si chiuderà il thread main
		t.start();// il metodo run viene richiamato direttamente da metodo start del thread
	}
}
