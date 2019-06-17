package dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import metier.*;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DAOArticle {
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void insert(Article object) {
		em.persist(object);

	}

	public Article selectById(Integer id) {
		Article a = em.find(Article.class, id);
		return a;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void update(Article object) {
		em.merge(object);
		
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Article object) {
		em.remove(object);

	}

	public List<Article> selectAll() {
		Query query = em.createQuery("from article");

		List<Article> liste = query.getResultList();

		em.close();
		return liste;

	}
//	public List<Article> selectAllFilm() {
//		Query query = em.createQuery("from film");
//
//		List<Article> liste = query.getResultList();
//
//		em.close();
//		return liste;
//	}
//	public List<Article> selectAllRealisateur() {
//		Query query = em.createQuery("from realisateur");
//
//		List<Article> liste = query.getResultList();
//
//		em.close();
//		return liste;
//	}

	
}
