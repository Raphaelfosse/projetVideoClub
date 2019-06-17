package dao;

import java.util.List;

import javax.persistence.*;

public class DAOArticle {
	private EntityManagerFactory emf;
	
	public void insert(Article object) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(object);

		em.getTransaction().commit();

		em.close();
	}

	public Article selectById(Integer noArticle) {
		EntityManager em = emf.createEntityManager();
		Article a = em.find(Article.class, noArticle);
		em.close();
		return a;

	}

	public void update(Article object) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.merge(object);

		em.getTransaction().commit();

		em.close();
	}

	public void delete(Article object) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.remove(object);

		em.getTransaction().commit();

		em.close();

	}

	public List<Article> selectAll() {
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Grade");

		List<Article> liste = query.getResultList();

		em.close();
		return liste;

	}


}
