package it.betacom.dpstrutturali.composite;

import java.util.ArrayList;
import java.util.List;

public class ObjComposite implements Forma{
	private List<Forma> forme = new ArrayList<Forma>();
	
	@Override
	public void disegna(String colore) {
		for(Forma f : forme) {
			f.disegna(colore);
		}
	}
	
	public void add(Forma f) {
		this.forme.add(f);
	}
	
	public void remove(Forma f) {
		forme.remove(f);
	}
	
	public void clear() {
		System.out.println("eliminate tutte le foglie");
		forme.clear();
	}
}
