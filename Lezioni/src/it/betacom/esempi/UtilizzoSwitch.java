package it.betacom.esempi;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilizzoSwitch {
	
	public static void main(String[] args) {
		Date data = new Date();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(data);
		int mese = c.get(Calendar.MONTH);
		String stagione = "";
		switch(mese) {
		case 0:
		case 1:
			stagione = "Inverno";
			break;
		case 2:
		case 3:
		case 4: stagione = "Primavera";
			break;
		case 5:
		case 6:
		case 7:stagione = "Estate";
			break;
		default: stagione = "Inverno"; //
		}
	}
}
