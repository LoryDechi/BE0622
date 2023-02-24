package esercizio2Giorno16;

import java.util.List;

public class Libro{
	
	List<Sezioni> sezioni;
	String autore;
	int prezzo;

	public Libro(List<Sezioni> sezioni, String autore, int prezzo) {
		this.sezioni = sezioni;
		this.autore = autore;
		this.prezzo = prezzo;
	}

	public int getNumeroPagine() {
		int numero = 0;
		for(int i = 0; i<sezioni.size(); i++) {
			numero += sezioni.get(i).getNumeroPagine();
		}
		return numero;
	}

	public List<Sezioni> getSezioni() {
		return sezioni;
	}

	public void setSezioni(List<Sezioni> sezioni) {
		this.sezioni = sezioni;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

}
