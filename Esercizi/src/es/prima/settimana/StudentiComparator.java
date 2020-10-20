package es.prima.settimana;

import java.util.Comparator;

public class StudentiComparator implements Comparator<Studente> {

	@Override
	public int compare(Studente o1, Studente o2) {
		int diffmedie = o1.getMedia() - o2.getMedia();
		if(diffmedie != 0)
			return diffmedie;	
		return 0;
	}

}
