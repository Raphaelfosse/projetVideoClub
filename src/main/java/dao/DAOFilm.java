package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import metier.Film;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DAOFilm implements IDAOFilm {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void insert(Film object) {
		em.persist(object);

	}

	@Override
	public Film selectById(Integer id) {
		Film a = em.find(Film.class, id);
		return a;

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void update(Film object) {
		em.merge(object);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Film object) {
		em.remove(em.merge(object));

	}

	@Override
	public List<Film> selectAll() {
		Query query = em.createQuery("from Film");

		List<Film> liste = query.getResultList();

		return liste;
	}
}
