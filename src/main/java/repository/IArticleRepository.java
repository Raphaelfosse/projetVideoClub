package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.*;

public interface IArticleRepository extends JpaRepository<Article, Integer>{


}
