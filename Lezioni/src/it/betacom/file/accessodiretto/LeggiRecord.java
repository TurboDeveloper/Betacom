package it.betacom.file.accessodiretto;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LeggiRecord implements ClienteCostants {
	private static RandomAccessFile file;

	public static void main(String[] args) {
		apri();
		leggi();
		chiudi();
	}

	private static void apri() {
		try {
			file = new RandomAccessFile(FILE_PATH, "r");
		} catch (IOException exc) {
			System.out.println(exc.getMessage());
		}
	}

	private static void chiudi() {
		try {
			if (file != null)
				file.close();
		} catch (IOException exc) {
			System.out.println(exc.getMessage());
		}
	}

	private static void leggi() {
		Cliente c = new Cliente();
		try { 
			while (true) {
				do {
					c.leggi(file);
				} while (c.getId() == 0);

				System.out.printf("%-20d%-20s%-20s%10.2f\n",
					c.getId(), c.getNome(),
					c.getCognome(), c.getStatoCredito());
			}
		} catch (EOFException exc) {
			System.out.println("Fine file");
			return;
		} catch (IOException exc) {
			System.out.println(exc.getMessage());

		}
	}
}
