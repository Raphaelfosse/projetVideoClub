package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.Article;

public interface IArticleRepository extends JpaRepository<Article, Integer>{

}
