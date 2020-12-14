package it.betacom.businnessmodel.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Impiegato {
	private long id;
	@Size(min=2, max=30, message="Da a 30 caratteri")
	private String nome;
	@DecimalMin("1000.00")
	private double stipendio;
	@Pattern(regexp="^[a-zA-Z]{2,30}", message="Solo lettere accettate. Massimo 30 caratteri")
	private String reparto;
	private String url_img;
	
	@Override
	public String toString() {
		return "Impiegato [id=" + id + ", nome=" + nome + ", stipendio=" + stipendio + ", reparto=" + reparto + "]";
	}
	public Impiegato(long id, String nome, double stipendio, String reparto, String url_img) {
		super();
		this.id = id;
		this.nome = nome;
		this.stipendio = stipendio;
		this.reparto = reparto;
		this.url_img = url_img;
	}
	public Impiegato() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public String getReparto() {
		return reparto;
	}
	public void setReparto(String reparto) {
		this.reparto = reparto;
	}
	public String getUrl_img() {
		return url_img;
	}
	public void setUrl_img(String url_img) {
		this.url_img = url_img;
	}
}
