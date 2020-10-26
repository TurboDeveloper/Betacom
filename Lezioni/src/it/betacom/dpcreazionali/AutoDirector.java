package it.betacom.dpcreazionali;

public class AutoDirector {
	
	private AbstractBuilderAuto aBuild;

	public void setaBuild(AbstractBuilderAuto aBuild) {
		this.aBuild = aBuild;
	}
	
	public Auto getAuto() {
		return aBuild.getAuto();
	}
	
	public void costruisciAuto() {
		aBuild.createNewAutoBuiler();
		aBuild.buildCilindrata();
		aBuild.buildModello();
		
	}
}
