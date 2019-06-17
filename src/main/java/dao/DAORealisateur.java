//package dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import metier.Realisateur;
//
//@Repository
//@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
//public class DAORealisateur implements IDAORealisateur {
//
//	@PersistenceContext
//	private EntityManager em;
//
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
//	public void insert(Realisateur object) {
//		em.persist(object);
//
//	}
//
//	@Override
//	public Realisateur selectById(Integer id) {
//		Realisateur a = em.find(Realisateur.class, id);
//		return a;
//
//	}
//
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
//	public void update(Realisateur object) {
//		em.merge(object);
//
//	}
//
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
//	public void delete(Realisateur object) {
//		em.remove(em.merge(object));
//
//	}
//
//	@Override
//	public List<Realisateur> selectAll() {
//		Query query = em.createQuery("from Realisateur");
//
//		List<Realisateur> liste = query.getResultList();
//
//		return liste;
//	}
//
//}
