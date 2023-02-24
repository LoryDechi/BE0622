package esercizio2Giorno16;

import java.util.List;

public class Sottosezioni extends Pagine{
	List<Pagine> pagine;

	
	
	public Sottosezioni(List<Pagine> pagine) {
		this.pagine = pagine;
	}

	public List<Pagine> getPagine() {
		return pagine;
	}

	public void setPagine(List<Pagine> pagine) {
		this.pagine = pagine;
	}

}
