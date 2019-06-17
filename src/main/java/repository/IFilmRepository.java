package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import metier.Film;


public interface IFilmRepository extends JpaRepository<Film, Integer> {
	
	@Query("select s from Film s left join fetch s.filmRealisateur where s.id =:id")
	public Optional<Film> findByIdWithRealisateur(@Param("id")Integer id);
	
}
