package esercizio1Giorno16;

import java.time.LocalDate;

public class Adapter implements DataSource {

	private Info i;
	
	public Adapter(Info i) {
		this.i = i;
	}

	@Override
	public String getNomeCompleto() {
		return i.getNome() + i.getCognome();
	}

	@Override
	public int getEta() {
		return LocalDate.now().getYear() - i.getDataDiNascita().getYear();
	}

}
