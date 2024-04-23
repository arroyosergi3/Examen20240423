package principal.controllers;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import principal.entities.Entidad;

public class SuperControlador {

	private String nombreTabla = "";
	private Class tipoEntidad;
	private static EntityManager em = null;

	protected EntityManager getEntityManager() {
		if (em == null) {
			em = Persistence.createEntityManagerFactory("Bankonter").createEntityManager();
		}
		return em;
	}

	
	public SuperControlador(String nombreTabla, Class tipoEntidad) {
		this.nombreTabla = nombreTabla;
		this.tipoEntidad = tipoEntidad;
	}

	public void insert(Entidad e) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();

	}

	public void update(Entidad e) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
	}
	
	public void delete(Entidad e) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
	}
	
	

	public List<? extends Entidad> findAll() {
		return (List<Entidad>) getEntityManager().createNativeQuery("SELECT * FROM " + nombreTabla, this.tipoEntidad)
				.getResultList();

	}
	
	public Entidad findById(int id) {
		Entidad e = (Entidad) em.find(Entidad.class, id);
		return e;
	}

	public Entidad getPrimero() {

		Entidad e = (Entidad) em.find(Entidad.class, minIdEnTabla());

		return e;

	}

	public Entidad getUltimo() {
		Entidad e = (Entidad) em.find(Entidad.class, maxIdEnTabla());

		return e;
	}

	private int minIdEnTabla() {
		Query q = em.createNativeQuery("SELECT min() FROM " + nombreTabla + ";", Entidad.class);
		int minId = (int) q.getSingleResult();
		return minId;
	}

	private int maxIdEnTabla() {
		Query q = em.createNativeQuery("SELECT max() FROM " + nombreTabla + ";", Entidad.class);
		int maxId = (int) q.getSingleResult();
		return maxId;
	}

}
