package es.primasettimana;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 1: Creare un programma calendario. Il programma deve dare la possibilità di inserire il mese 
 *    e l'anno attuale per mostrare le informazioni relative al mese evidenziando i giorni del mese 
 *    e il giorno attuale. Usare le classi calendario dell'API.
 * 2: Usando i concetti OOP sviluppare un piccolo applicativo per la registrazione di ordini.
      Il programma dovrà fornire nel menu la possibilità di inserire i dati e di visualizzare un riepilogo complessivo.
      Dopo aver inserito il record relativo al cliente ( da memorizzare in una opportuna struttura)
      registrare per ciascun ordine i prodotti ( nome, prezzo unitario) acquistati.
      Calcolare per ogni cliente il totale degli ordini.
 */
public class EsVenerdi {

	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Che esercizio vuoi fare? ");
		int n1 = in.nextInt();
		switch(n1) {
		case 1: esercizio1();
				System.out.println("SVOLGIMENTO ESERCIZIO 1");
		break;
		default: esercizio2();	
				System.out.println("SVOLGIMENTO ESERCIZIO 2");
		}
	}

	private static void esercizio1() {
		
		int mese, anno;
		System.out.println("Inserisci mese");
		mese = in.nextInt();
		System.out.println("Inserisci anno");
		anno = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		GregorianCalendar gCal = new GregorianCalendar(anno, mese -1, cal.get(Calendar.DATE));	
		
		int dayOfWeek = gCal.get(Calendar.DAY_OF_WEEK);
		int daysInMonth = gCal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(format.format(gCal.getTime()));
		System.out.println(" L  M  M  G  V  S  D");	
		
		String spazioIniziale = "";
		for (int i = 0; i < dayOfWeek - 1; i++) {
		    spazioIniziale += "   ";
		}
		System.out.print(spazioIniziale);
		for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
		    for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
		        System.out.printf("%2d ", dayOfMonth);
		        dayOfMonth++;
		    }
		    System.out.println();
		}
		
	}
	
	private static void esercizio2() {
		System.out.println("come ti chiami?");
		Cliente c = new Cliente(in.nextLine());
		String compere ="", ord="";
		int prodo=0, i = 0;

		String menu="prodotto1 5€ numero selezione:1 \nprodotto2 10€ numero selezione:2 \nprodotto3 15€ numero selezione:3";
		Ordine o;
		do {
			 i++;
			  o= new Ordine(i);
			do {
				System.out.println("buongiorno " + c.getNome() +" ,i prodotti presenti sono :\n" + menu + "\nselezionare il numero corrispondente al prodotto");
				prodo=in.nextInt();
				switch(prodo)
				{
				case 1:
					Prodotto p=new Prodotto("prodotto1",5);
					o.setProdotti(p);
					System.out.println("vuoi comprare altro? si/no");
					compere=in.next();
					break;
				case 2:
					Prodotto p1=new Prodotto("prodotto2",10);

					o.setProdotti(p1);
					System.out.println("vuoi comprare altro? si/no");
					compere=in.next();
					break;
				case 3:
					Prodotto p2=new Prodotto("prodotto3",155);

					o.setProdotti(p2);
					System.out.println("vuoi comprare altro? si/no");
					compere=in.next();
					break;
				default:
					System.out.println("comando non riconosciuto");
				}


			}while(compere.equals("si"));
			c.setOrdini(o);
			System.out.println("vuoi effettuare un  nuovo ordine?");
			ord=in.next();
			
		}while(ord.equals("si"));



			//System.err.println(o.toString() + " il totale da pagare è : " + o.totale()+"\n");
			
			System.out.println(c.toString());
		in.close();
	}
		
	
}
