package it.betacom.dp.comportamentali.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	public List<Memento> mem = new ArrayList<Memento>();
	
	public void add(Memento stato) {
		mem.add(stato);
	}
	
	public Memento get(int i) {
		return mem.get(i);
	}
}
