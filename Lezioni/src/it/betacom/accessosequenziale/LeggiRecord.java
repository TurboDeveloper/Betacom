package it.betacom.accessosequenziale;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeggiRecord implements ClienteCostants{
	
	private static Scanner file; //necessario per leggere
	
	public static void main(String[] args) {
		apri();
		leggi();
		chiudi();
		
	}
	
	private static void leggi() {
		Cliente c =  new Cliente();
		try { 
			while (file.hasNext()) {
				c.setId(file.nextInt());
				c.setNome(file.next());
				c.setCognome(file.next());
				c.setStatoCredito(file.nextInt());
				
				System.out.printf("%-20d%-20s%-20s%10.2f\n",
					c.getId(), c.getNome(),
					c.getCognome(), c.getStatoCredito());
			}
		} catch (NoSuchElementException exc) {
			System.out.println("Fine file");
			file.nextLine();
		}
		
	}



	private static void apri() {
		try {
			file = new Scanner(new File(FILE_PATH));
		}catch(IOException exc) {
			System.out.println(exc.getMessage());
		}
	}

	private static void chiudi() {
		if(file != null)
			file.close();
	}
}
