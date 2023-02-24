package esercizio1Giorno16;

public class UserData implements DataSource { 
	 
	 String nomeCompleto; 
	 int eta; 

	public void getData(DataSource ds) { 
	 nomeCompleto = ds.getNomeCompleto(); 
	 eta = ds.getEta(); 
	 }

	@Override
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	@Override
	public int getEta() {
		return eta;
	} 
	 
}
