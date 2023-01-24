package app;

import java.time.LocalDate;

import dao.EventoDAO;
import entities.TipoEvento;

public class Main {

	public static void main(String[] args) {
		
		boolean insertEvento = false;
		boolean getById = false;
		boolean delete = false;
		boolean refresh = true;
		
		if (insertEvento) {
			EventoDAO.save("Tomorrowland", LocalDate.parse("2023-07-21"), "Evento musicale", TipoEvento.PUBBLICO, 600000);			
		}
		
		if ( getById) {
			EventoDAO.getEventoById(1);
		}
		
		if (delete) {
			EventoDAO.deleteById(2);
		}
		
		if ( refresh) {
			EventoDAO.refresh(1, 700000);
		}
		
		EventoDAO.closeEm();

	}

}
