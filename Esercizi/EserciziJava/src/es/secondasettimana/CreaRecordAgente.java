package es.secondasettimana;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class CreaRecordAgente implements AgenteCostants{
	
	private static ObjectOutputStream file;
	private static Iterator<Venditore> itVen;
	
	public CreaRecordAgente(Iterator<Venditore> itVen) {
		CreaRecordAgente.itVen = itVen;
		apri();
		scrivi(); 
		chiudi();
	}
	
	private static void scrivi() {
		while(itVen.hasNext()) {
			Venditore ven = itVen.next();
			try {
				file.writeObject(ven);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				return;
			}
		}
	}

	private static void apri() {
		try {
			//crea uno stream in output che scrive su uno specifico output stream
			file = new ObjectOutputStream(
					new FileOutputStream(FILE_PATH));
			//crea uno strea output che scrive su un determinato percorso
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
