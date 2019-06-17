package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import metier.*;

public interface IArticleRepository extends JpaRepository<Article, Integer>{
//	@Query("select s from Article s left join fetch s.noArticle where s.id=:id")
//	public Optional<Article> findByIdWithNoArticle(@Param("id") Integer id);

}
