package es.seconda.settimana;

public class Modulo {
	
	private int codVen;
	private int codProd;
	private int tot;
	
	public int getCodVen() {
		return codVen;
	}

	public void setCodVen(int codVen) {
		this.codVen = codVen;
	}

	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public Modulo(int codVen, int codProd, int tot) {
		super();
		this.codVen = codVen;
		this.codProd = codProd;
		this.tot = tot;
	}
}
