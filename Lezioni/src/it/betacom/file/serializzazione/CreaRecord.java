package it.betacom.file.serializzazione;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreaRecord implements ClienteCostants{
	
	
	private static ObjectOutputStream file; //necessario per scrivere
	private static Scanner in;
	
	public static void main(String[] args) {
		apri();
		scrivi();
		chiudi();
		
	}
	
	private static void scrivi() {
		Cliente c;
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

				if(id >0) {
					c = new Cliente(id, nome, cognome, statoCredito); 
					file.writeObject(c); //PROCESSO DI SERIALIZZAZIONE
				}else
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


	private static void apri() {
		try {
			file = new ObjectOutputStream(
					new FileOutputStream(FILE_PATH));
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
	
}
