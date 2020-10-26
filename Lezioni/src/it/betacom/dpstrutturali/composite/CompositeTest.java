package it.betacom.dpstrutturali.composite;

public class CompositeTest {
	public static void main(String[] args) {
		Forma quadrato = new Quadrato();
		Cerchio cerchio = new Cerchio();
		
		ObjComposite composite = new ObjComposite();
		composite.add(quadrato);
		composite.add(cerchio);
		composite.add(quadrato);
		
		composite.disegna("red");
		composite.clear();
		
		composite.add(cerchio);
		composite.add(quadrato);
		
		composite.disegna("green");
		
	}
}
