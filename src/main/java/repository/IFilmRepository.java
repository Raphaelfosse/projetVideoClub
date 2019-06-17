package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.Film;


public interface IFilmRepository extends JpaRepository<Film, Integer> {

}
