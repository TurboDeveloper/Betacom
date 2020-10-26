package it.betacom.file.accessodiretto;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Cliente {
	
	private int id;
	private String nome;
	private String cognome;
	private double statoCredito;
	
	public Cliente(int id, String nome, String cognome, double statoCredito) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.statoCredito = statoCredito;
	}
	
	public Cliente() {
		this(0,"","",0.00);// questo this � la chiamata al costruttore della classe stessa
	}//imposta i dati del cliente a zero, ed � obbligatorio

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getStatoCredito() {
		return statoCredito;
	}

	public void setStatoCredito(double statoCredito) {
		this.statoCredito = statoCredito;
	}
	// DOBBIAM FARE UN METODO LEGGI E UNO SCRIVI
	public void leggi(RandomAccessFile file) throws IOException {// quando leggo e scrivo su file � obbligatorio gestire l'exception
		setId(file.readInt());// i metodi file li prendiamo attraverso il RandomAccessFIle
		setNome(leggiNominativo(file)); // mi serve per leggere le informazioni, perch� non ho un metodo che legga tutta la riga
		setCognome(leggiNominativo(file));
		setStatoCredito(file.readDouble());
	}
	

	public void scrivi (RandomAccessFile file) throws IOException{
		file.writeInt(getId());
		scriviNominativo(file,getNome());
		scriviNominativo(file,getCognome());
		file.writeDouble(getStatoCredito());
	}
	

	public String leggiNominativo(RandomAccessFile file)throws IOException {
		char nominativo[]= new char[20];// per la grandezza non c'� una regola vera e propria
		char temp;//carattere singolo
		for(int i=0;i<nominativo.length;i++) {// facciam scorrere tutti  i char nell'array
			temp = file.readChar();
			nominativo[i]=temp;
		}
		return new String(nominativo).replace('\0',' '); 
		                                // esiste un costruttore di stringhe che usa un array di char
		                               // abbiamo  per� cos� un prob, perch� tutte le stringhe finiscono con
		                               // \0 che � il termine di fine stringa,quindi facciamo replace
	}

	public void scriviNominativo(RandomAccessFile file, String nominativo) 
			throws IOException{
		
		StringBuffer buffer = null;
		if(nominativo != null)
			buffer = new StringBuffer(nominativo);
		else 
			buffer = new StringBuffer(20);
		buffer.setLength(20);
		file.writeChars(buffer.toString());
	}
	
	
}
