package it.epicode.be.gestioneventi.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.epicode.be.gestioneventi.model.Concerto;
import it.epicode.be.gestioneventi.model.Evento;
import it.epicode.be.gestioneventi.model.Genere;
import it.epicode.be.gestioneventi.util.JpaUtil;

public class EventoDAO {
	private static final Logger logger = LoggerFactory.getLogger(EventoDAO.class);

	public void save(Evento object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();

			em.persist(object);

			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();

			logger.error("Error saving object: " + object.getClass().getSimpleName(), ex);
			throw ex;

		} finally {
			em.close();
		}

	}

	public void refresh(Evento object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			em.refresh(object);

		} finally {
			em.close();
		}

	}

	public Evento getById(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			return em.find(Evento.class, id);

		} finally {
			em.close();
		}

	}

	public void delete(Evento object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();

			em.remove(object);

			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			logger.error("Error deleting object: " + object.getClass().getSimpleName(), ex);
			throw ex;

		} finally {
			em.close();
		}

	}

	public void getConcertiInStreaming(boolean b) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createQuery("SELECT c FROM Concerto c WHERE streaming = :n");
		q.setParameter("n", b);

		List<Concerto> res = q.getResultList();

		for (Concerto c : res) {
			System.out.println(c);
		}

	}
	
	public void getConcertiPerGenere(Genere g) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createQuery("SELECT c FROM Concerto c WHERE genere = :n");
		q.setParameter("n", g);

		List<Concerto> res = q.getResultList();

		for (Concerto c : res) {
			System.out.println(c);
		}

	}

}
