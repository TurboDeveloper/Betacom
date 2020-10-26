package it.betacom.file.parsingxml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
//dom = document objact model W3C
public class XMLConverter implements XMLConstants {
	
	private Document docXML; //rappresenta l intero documento xml
	private Element root; //rappresenta la root degli elementi all interno della pagina
	private BufferedReader input;
	private StreamResult output; //impostare la destinazione della trasformazione



	public static void main(String[] args) {
		new XMLConverter().converti();
	}


//leggo dal file
	private void converti() {
		try {
			String dir = "Users\\betacom\\Desktop\\Accademy\\Prove";
			new File(BASE_DIR + dir).mkdir(); //directory output
			
			input = new BufferedReader(
					new FileReader(FILE)); //
			
			output = new StreamResult(FILE_OUTPUT); //scrivere output
			
			inizializzaXML();
			String linea;
			while((linea = input.readLine()) != null) {
				elabora(linea);
			}
			input.close();
			scriviXML();
		}catch(Exception e) {
			System.out.println("Motivo: " + e.getMessage());
			e.printStackTrace();
		}
		
	}


	private void inizializzaXML() throws ParserConfigurationException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		DOMImplementation impl = builder.getDOMImplementation();
		docXML = impl.createDocument(null, "prodotti", null);
		root = docXML.getDocumentElement();
		
		//1 creaimo factory prdotti
		//2 creoi builde
		//3 domxml che mi crea il documento
		//4 si inizializza il documento
		//5 elemento principale del documento xml
	}
	
	private void elabora(String linea) {
		String[] elementi = linea.split("\\;");
		Element e0 = docXML.createElement("prodotto");
		//root come elemento radice
		
		Element e1 = docXML.createElement("marca");
		Node n1 = docXML.createTextNode(elementi[0]);
		e1.appendChild(n1);
		
		Element e2 = docXML.createElement("modello");
		Node n2 = docXML.createTextNode(elementi[1]);
		e2.appendChild(n2);
		
		Element e3 = docXML.createElement("prezzo");
		Node n3 = docXML.createTextNode(elementi[2]);
		e3.appendChild(n3);
		
		e0.appendChild(e1);
		e0.appendChild(e2);
		e0.appendChild(e3);
		
		root.appendChild(e0);
	}
	
	public void scriviXML() throws TransformerException {
		
		DOMSource sorgente = new DOMSource(docXML);
		TransformerFactory tf = TransformerFactory.newInstance(); //factory
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");	//tipologia base
		transformer.setOutputProperty(OutputKeys.ENCODING, "ISO8859-1"); //formato codifica
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");	//indentazione
		transformer.transform(sorgente, output);	//fa l operazione effettiva
		System.out.println("SCHEMA CONVERTITO");
	}

	
	
	
	
	
	
}

