package esercizio2Giorno16;

import java.util.List;

public class Sezioni{

	List<Sottosezioni> sottosezioni;

	public Sezioni(List<Sottosezioni> sottosezioni) {
		this.sottosezioni = sottosezioni;
	}

	public List<Sottosezioni> getSottosezioni() {
		return sottosezioni;
	}

	public void setSottosezioni(List<Sottosezioni> sottosezioni) {
		this.sottosezioni = sottosezioni;
	}
	
	public int getNumeroPagine() {
		int numero = 0;
		for(int i = 0; i<sottosezioni.size(); i++) {
			numero += sottosezioni.get(i).pagine.size();
		}
		return numero;
	}
}
