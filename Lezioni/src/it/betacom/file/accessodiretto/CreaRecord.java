package it.betacom.file.accessodiretto;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreaRecord implements ClienteCostants{
	
	private static RandomAccessFile file;
	private static Scanner in;
	
	public static void main(String[] args) {
		apri();
		scrivi();
		chiudi();
		
	}
	
	private static void apri() {
		try {
			file = new RandomAccessFile(FILE_PATH, "rw");
		}catch(IOException exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	private static void chiudi() {
		try {
			if(file != null)
				file.close();
		}catch(IOException exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	private static void scrivi() {
		Cliente cliente = new Cliente();
		int id = 0;
		String nome; 
		String cognome;
		double statoCredito;
		
		in = new Scanner(System.in);
		
		System.out.println("Inserire id, nome, cognome, stato credito");
		while(in.hasNext()) {
			try {
				id = in.nextInt();
				nome = in.next();
				cognome = in.next();
				statoCredito = in.nextDouble();
				
				if(id >0 && id<=DIMENSIONE_DATI) {
					cliente.setId(id);
					cliente.setNome(nome);
					cliente.setCognome(cognome);
					cliente.setStatoCredito(statoCredito);
					file.seek((id-1)*DIMENSIONE_RECORD);
					cliente.scrivi(file);
				} else
					System.out.println("Valore id errato");
			} catch (IOException exc) {
				System.out.println(exc.getMessage());
				return;
			} catch (NoSuchElementException exc) {
				System.out.println("Input non valido");
				in.nextLine();
			}		
		}
		in.close();
	}
}
