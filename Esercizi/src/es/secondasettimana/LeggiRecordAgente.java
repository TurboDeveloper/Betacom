package es.secondasettimana;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeggiRecordAgente implements AgenteCostants{
	
	private static ObjectInputStream file;
	
	public LeggiRecordAgente() {
		
		apri();
		leggi();
		chiudi();
	}

	private void apri() {
		try {
			file = new ObjectInputStream(
					new FileInputStream(FILE_PATH));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	private void leggi() {
		Venditore ven;
		try {
			while(true) {
				ven = (Venditore) file.readObject();
				System.out.println(ven.toString());
			}
		}catch (EOFException exc) {
			System.out.println("Fine file");
			return;
		} catch (IOException exc) {
			System.out.println(exc.getMessage());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
