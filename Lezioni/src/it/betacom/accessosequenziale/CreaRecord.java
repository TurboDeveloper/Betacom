package it.betacom.accessosequenziale;

import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreaRecord implements ClienteCostants{
	
	private static Formatter file; //necessario per scrivere
	private static Scanner in;
	
	public static void main(String[] args) {
		apri();
		scrivi();
		chiudi();
		
	}
	
	private static void scrivi() {
		Cliente c = new Cliente();
		in = new Scanner(System.in);
		System.out.println("Inserire i dati del cliente: ");
		
		while(in.hasNext()) {
			try {
				c.setId(in.nextInt());
				c.setNome(in.next());
				c.setCognome(in.next());
				c.setStatoCredito(in.nextDouble());
				
				if(c.getId() > 0) { //%.2f forza inserimento 2 double, \r riavvolge il carrello
					file.format(
							"%d %s %s %.2f \r \n",
							c.getId(),
							c.getNome(),
							c.getCognome(),
							c.getStatoCredito());
				}else
					System.out.println("id errato");
			}catch(FormatterClosedException exc) {
				System.out.println(exc.getMessage());
				return;
			}catch(NoSuchElementException exc) {
				System.out.println("input non valido");
				in.nextLine();
			}
		}
		in.close();
		
	}

	private static void apri() {
		try {
			file = new Formatter(FILE_PATH);
		}catch(IOException exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	private static void chiudi() {
		if(file != null)
			file.close();

	}
}
