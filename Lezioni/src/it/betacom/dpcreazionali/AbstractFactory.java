package it.betacom.dpcreazionali;

public abstract class AbstractFactory {
	
	public static AbstractFactory getFactory() {
	//decidere in base delle condizioni o controlli come dovrà essere creata l istanza ddel prodotto
		int flag = 0; //qualsiasi condizone
		if(flag == 0) {
			return new ConctreteFactory();
		}else
			return new SkillsFactory(); 
	}
	
	public abstract AbstractFactory createAbstract();
	 //oggetto che utilizzeremo e istanziato nel modo corret}
	}
