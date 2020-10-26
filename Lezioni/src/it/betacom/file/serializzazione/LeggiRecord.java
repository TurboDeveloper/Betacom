package it.betacom.file.serializzazione;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeggiRecord implements ClienteCostants{
	

	private static ObjectInputStream file; //necessario per leggere
	
	public static void main(String[] args) {
		apri();
		leggi();
		chiudi();
		
	}
	
	private static void leggi() {
		Cliente c;
		try { 
			while (true) {
				c = (Cliente)file.readObject();
				
				System.out.printf("%-20d%-20s%-20s%10.2f\n",
					c.getId(), c.getNome(),
					c.getCognome(), c.getStatoCredito());
			}
		} catch (EOFException exc) {
			System.out.println("Fine file");
			return;
		} catch (IOException exc) {
			System.out.println(exc.getMessage());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}



	private static void apri() {
		try {
			file = new ObjectInputStream(
					new FileInputStream(FILE_PATH));
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
