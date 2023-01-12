package esercizio1Giorno4;

public class GestioneDipendenti {

	public static void main(String[] args) {

		Dipendente o1 = new Dipendente(1, Dipartimento.PRODUZIONE);
		Dipendente o2 = new Dipendente(2, Dipartimento.PRODUZIONE);

		Dipendente i1 = new Dipendente(3, 1200, 36, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);

		Dipendente d1 = new Dipendente(4, 2000, 60, Livello.DIRIGENTE, Dipartimento.VENDITE);

		o1.promuovi();
		i1.promuovi();

		Dipendente[] dipendenti = { o1, o2, i1, d1 };
		for (Dipendente d : dipendenti) {
			d.stampaDatiDipendente();
		}
		
		for (Dipendente d : dipendenti) {
			System.out.println("Stipendio con straordinari della matricola " + d.getMatricola() + " : " + Dipendente.calcolaPaga(d, 5));
		}
		
		
		
		
	}

}
