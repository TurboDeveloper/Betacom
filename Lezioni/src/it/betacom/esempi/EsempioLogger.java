package it.betacom.esempi;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EsempioLogger {
	
	public static void main(String[] args) {
		
		Logger log = Logger.getLogger("log1");
		Logger log2 = Logger.getLogger("log2");

		FileHandler fileHandler;
		try{
			fileHandler = new FileHandler("c:\\Log\\logfile", true);
			log.addHandler(fileHandler);
			//esistono priorità nei messaggi di log
			log.setLevel(Level.ALL);
			
			//se non formatto il log mi da il risultato in formato XML
			//se no
			SimpleFormatter format = new SimpleFormatter();
			fileHandler.setFormatter(format);
			
			int x= 10;
			log.log((Level.INFO), "Logger su file e in console" + x);
			log.log((Level.INFO), "Logger in console" + x);
			int r = 10/0;
		
		}catch(SecurityException se){
			
			log.log((Level.SEVERE), se.getMessage());		
		}catch(IOException io){
			
			log.log((Level.SEVERE), io.getMessage());		
		}catch(Exception exc) {
			log.log((Level.SEVERE), exc.getMessage());	
			exc.printStackTrace();
		}
	}
}
