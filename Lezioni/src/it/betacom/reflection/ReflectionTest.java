package it.betacom.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {
	public static void main(String[] args) {
		try {
			String stringa = new String();
			Class<? extends String> classe1 = stringa.getClass();
            //sopra e sotto fan la stessa cosa, solo che in uno creo l'oggetto, sotto gli passo la classe, dandogli il percorso 
			// del paccheto completo
			Class<?> classe2 = Class.forName("java.lang.String");

			if (classe1.getName().equals(classe2.getName()))
				System.out.println("Le classi sono uguali");
			if (classe1.isInterface()) // con questo, guardo se la classe che gli sto passando, che non conosco, è un interfaccia o meno
				System.out.println("è un\'interface");

			Class<?> superClasse = classe1.getSuperclass(); // qui, vado a prendere la superClass della classe passata
			
			System.out.println("super classe dell'ogg " + superClasse); // qui stampo la superclasse

			String oggetto = (String) classe1.getDeclaredConstructor().newInstance();// qui istanzio la classe, ma non conoscendola
			                                                                         // gli passo un Costruttore fittizio
            // qui sopra instanzio l'oggetto senza però crearlo
			oggetto = "max";
			System.out.println("Lunghezza stringa: " + oggetto.length());

			Class<?> classe3 = Class.forName("it.betacom.reflection.Prodotto");

			// Costruttori
			Constructor<?> elencoCostruttori[] = classe3.getConstructors();
			System.out.println("Numero costruttori: " + elencoCostruttori.length);

			for (int i = 0; i < elencoCostruttori.length; i++) {
				String descrizione = elencoCostruttori[i].toString();
				System.out.println("Costruttore n:" + (i + 1) + " : " + descrizione);
				Class<?> tipologiaParametri[] = elencoCostruttori[i].getParameterTypes();
				if (tipologiaParametri.length == 0) {
					System.out.println("Nessun parametro");
					continue;
				}
				System.out.println("Parametri: ");
				for (int j = 0; j < tipologiaParametri.length; j++) {
					System.out.println(tipologiaParametri[j].getName());
				}
			}

			// campi istanza
			Field campiDiIstanza[] = classe3.getDeclaredFields();
			for (int i = 0; i < campiDiIstanza.length; i++) {
				Field campo = campiDiIstanza[i];
				System.out.println("------------\nCampo istanza n:" + (i + 1));
				System.out.println("Nome campo:" + campo.getName());
				System.out.println("Tipo campo:" + campo.getType());
				System.out.println("Modificatore accesso = " + Modifier.toString(campo.getModifiers()));
			}

			// metodi

			Method elencoMetodi[] = classe2.getDeclaredMethods();
			for (int i = 0; i < elencoMetodi.length; i++) {
				Method metodo = elencoMetodi[i];

				String descrizione = metodo.toString();
				System.out.println("----------------\nDescrizione metodo n: " + (i + 1) + " : " + descrizione);

				// nome e modificatore
				System.out.println("Nome metodo: " + metodo.getName());
				System.out.println("Modificatore accesso metodo = " + Modifier.toString(metodo.getModifiers()));

				Class<?> tipologiaParametri[] = elencoMetodi[i].getParameterTypes();
				if (tipologiaParametri.length == 0) {
					System.out.println("Nessun parametro");
					continue;
				}
				System.out.println("Parametri: ");
				for (int j = 0; j < tipologiaParametri.length; j++)
					System.out.println(tipologiaParametri[j].getName());

				Class<?> tipoDiRitorno = metodo.getReturnType();
				System.out.println("Tipo di ritorno: " + tipoDiRitorno.getName());

				Class<?> tipoEccezioni[] = metodo.getExceptionTypes();
				if (tipoEccezioni.length == 0) {
					System.out.println("Non ci sono eccezioni");
				} else {
					System.out.println("Il metodo solleva le seguenti eccezioni: ");
					for (int j = 0; j < tipoEccezioni.length; j++)
						System.out.println(tipoEccezioni[j].getName());

				}
				//-----------------------------------------------------------------
				Prodotto p1 = new Prodotto("apple","smartphone");
				Prodotto p2 = new Prodotto("apple","tablet");
				Prodotto p3 = new Prodotto("apple","computer");
				
				Class<?> classe= p1.getClass();
				Method metodoClasse = classe.getMethod("equals", new Class[] {new Object().getClass()});
				
				// recupero il metodo equals di prodoto 
				
				Object confronto = metodoClasse.invoke(p1, p2); // Object confronto sarà = al metodo equals
				                                                // tra p1 e p2
				System.out.println("confronto p1 e p2 : " + confronto);
				
				Field campoClasse = classe.getField("descrizione"); // la classe che abbiamo ottenuto da p1
				                                                    // otteniamo la descrizione dell'oggetto p1
				campoClasse.set(p3, "smartphone"); // modifichiamo la descrizione di p3
				System.out.println("descrizione p3 " + p3.descrizione);
				
				
				Object confronto2 = metodoClasse.invoke(p1, p3);
				System.out.println("confronto p1 e p3 " + confronto2);

			}

		} catch (Exception exc) {
			exc.getMessage();
			exc.printStackTrace();
		}
	}
}