package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.FilmRealisateur;
import metier.FilmRealisateurKey;

public interface IFilmRealisateurRepository extends JpaRepository<FilmRealisateur, FilmRealisateurKey> {

}
