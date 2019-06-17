package dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import metier.*;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DAOAdresse implements IDAOAdresse {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void insert(Adresse object) {
		em.persist(object);

	}

	@Override
	public Adresse selectById(Integer id) {
		Adresse a = em.find(Adresse.class, id);
		return a;

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void update(Adresse object) {
		em.merge(object);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Adresse object) {
		em.remove(em.merge(object));

	}

	@Override
	public List<Adresse> selectAll() {
		Query query = em.createQuery("from Adherent");

		List<Adresse> liste = query.getResultList();

		return liste;
	}
}
