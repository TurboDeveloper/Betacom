package it.betacom.file.accessodiretto;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CreaStruttura implements ClienteCostants {
	
	public static void main(String[] args) {
		creaFile();
	}
	
	
	private static void creaFile() {
		
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(FILE_PATH, "rw");
			
			Cliente c = new Cliente();
			for(int i = 0; i < DIMENSIONE_DATI; i++) {
				c.scrivi(file);
			}
			System.out.println("Creato file ad accesso diretto");
		}catch(IOException exc) {
			System.out.println(exc.getMessage());
		}finally {
			
			try {
				if(file != null)
					file.close();
			}catch(IOException exc) {
				System.out.println(exc.getMessage());
				System.exit(1);
			}
		}
	}
}
