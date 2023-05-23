package com.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.model.Alimento;
import com.hibernate.util.HibernateUtil;

public class AlimentoDAO {
	// Insertar
	public void insertAlimento(Alimento a) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.persist(a);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	
	// Actualizar
		public void updateAlimento(Alimento a) {
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				session.merge(a);
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
			}
		}
		
		
		// Borrar
		public void deleteAlimento(int id) {
			Transaction transaction = null;
			Alimento a = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				a = session.get(Alimento.class, id);
				session.remove(a);
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
			}
		}
		
		
		
		// Selección simple
		public Alimento selectAlimentoById(int id) {
			Transaction transaction = null;
			Alimento a = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				a = session.get(Alimento.class, id);
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
			}
			return a;
		}
		
		public Alimento selectAlimentoByNombre(String al) {
			Transaction transaction = null;
			Alimento a = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				Query<Alimento> query = session.createQuery("FROM Alimento WHERE nombre = :nomParam",Alimento.class);
				query.setParameter("nomParam", al);
				a=query.uniqueResult();
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
			}
			return a;
		}
		
		// Selección múltiple
		public List<Alimento> selectAllAlimento() {
			Transaction transaction = null;
			List<Alimento> alimentos = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				alimentos = session.createQuery("FROM Alimento", Alimento.class).getResultList();
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
			}
			return alimentos;
		}

}
