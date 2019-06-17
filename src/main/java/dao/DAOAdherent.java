package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import metier.*;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DAOAdherent implements IDAOAdherent {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void insert(Adherent object) {
		em.persist(object);

	}

	@Override
	public Adherent selectById(Integer id) {
		Adherent a = em.find(Adherent.class, id);
		return a;

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void update(Adherent object) {
		em.merge(object);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Adherent object) {
		em.remove(em.merge(object));

	}

	@Override
	public List<Adherent> selectAll() {
		Query query = em.createQuery("from Adehrent");

		List<Adherent> liste = query.getResultList();

		return liste;
	}

}
