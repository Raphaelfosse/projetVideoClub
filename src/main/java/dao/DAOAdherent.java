package dao;

import java.util.*;

import javax.persistence.*;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

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
		Query query = em.createQuery("from Adherent");

		List<Adherent> liste = query.getResultList();

		return liste;
	}

	@Override
	public List<Adherent> selectAllWithDVD() {
		Query query = em.createNativeQuery(
				"SELECT * from adherent,article where adherent.article_id=article.id and article_type='dvd' ",
				Adherent.class);

		List<Adherent> liste = query.getResultList();

		return liste;

	}

	@Override
	public List<Adherent> selectAllWithBluRay() {
		Query query = em.createNativeQuery(
				"SELECT * from adherent,article where adherent.article_id=article.id and article_type='bluray' ",
				Adherent.class);

		List<Adherent> liste = query.getResultList();

		return liste;
	}

	@Override
	public List<Adherent> selectAllWithFilm() {

		Query query = em.createNamedQuery("Adherent.selectAllWithFilm", Adherent.class);

		List<Adherent> liste = query.getResultList();

		return liste;
	}

	@Override
	public List<Adherent> selectAllWithRealisateur() {
		// todo
		Query query = em.createNamedQuery("Adherent.selectAllWithRealisateur", Adherent.class);

		List<Adherent> liste = query.getResultList();

		return liste;
	}


	@Override
	public List<Adherent> selectAllWithCodePostal(String codePostal) {
		// todo
		Query query = em.createNativeQuery("SELECT * from adherent,adresse where adherent.adresse=id ", Adherent.class);

		List<Adherent> liste = query.getResultList();

		return liste;
	}

}
