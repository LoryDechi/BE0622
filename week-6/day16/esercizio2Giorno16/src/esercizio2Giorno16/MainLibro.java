package esercizio2Giorno16;

import java.util.ArrayList;
import java.util.List;

public class MainLibro {

	public static void main(String[] args) {

		Pagine p = new Pagine();
		Pagine p1 = new Pagine();
		Pagine p2 = new Pagine();

		List<Pagine> lp = new ArrayList<>();
		lp.add(p);
		lp.add(p1);
		lp.add(p2);

		Sottosezioni s = new Sottosezioni(lp);
		Sottosezioni s1 = new Sottosezioni(lp);

		List<Sottosezioni> ls = new ArrayList<>();

		ls.add(s);
		ls.add(s1);

		Sezioni sez = new Sezioni(ls);

		List<Sezioni> lsez = new ArrayList<>();

		lsez.add(sez);

		Libro libro = new Libro(lsez,"Pinco Pallino",20);

		System.out.println(libro.getNumeroPagine());
	}

}
