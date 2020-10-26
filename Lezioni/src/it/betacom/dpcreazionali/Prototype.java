package it.betacom.dpcreazionali;

public class Prototype implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		try {
			Prototype p = (Prototype)super.clone();
		return p;
		
		}catch(CloneNotSupportedException exc) {
			return null;
		}
		}
	
}
