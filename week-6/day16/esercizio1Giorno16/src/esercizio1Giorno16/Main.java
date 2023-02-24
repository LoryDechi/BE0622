package esercizio1Giorno16;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		d.setYear(1998);
		d.setMonth(06);
		d.setDate(06);
		Info i = new Info();
		i.setNome("Pinco");
		i.setCognome("Pallino");
		i.DataDiNascita(d);
		
		DataSource a = new Adapter(i);
		
		UserData u = new UserData();
		
		u.getData(a);
		
		System.out.println(u.getNomeCompleto());
		System.out.println(u.getEta());
		
	}

}
