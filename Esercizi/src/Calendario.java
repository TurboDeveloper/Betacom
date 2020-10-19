import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendario {
		
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
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
		
		//System.out.println(format.format(gCal.getTime()));
		
		System.out.println(format.format(gCal.getTime()));
		System.out.println(" L  M  M  G  V  S  D");
		
		
		String initialSpace = "";
		for (int i = 0; i < dayOfWeek - 1; i++) {
		    initialSpace += "   ";
		}
		System.out.print(initialSpace);
		//System.out.print(dayInMonth);
		//print the days of the month starting from 1
		for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
		    for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
		        System.out.printf("%2d ", dayOfMonth);
		        dayOfMonth++;
		    }
		    System.out.println();
		}
	}
}
