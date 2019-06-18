package services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metier.*;
import repository.*;
@Service
public class FilmService {
	@Autowired
	private IFilmRepository iFilmRepository;

	@Autowired
	private IRealisateurRepository iRealisateurRepository;

	@Autowired
	private IFilmRealisateurRepository iFilmRealisateurRepository;

	public void addRealisateur(Film film, Realisateur realisateur) {
		
		Optional<Film> opt = iFilmRepository.findByIdWithRealisateur(film.getId());
		if (opt.isPresent()) {
			FilmRealisateur fr = new FilmRealisateur();
			
			fr.setKey(new FilmRealisateurKey(opt.get(), iRealisateurRepository.findById(realisateur.getId()).get()));

			iFilmRealisateurRepository.save(fr);
		}
	}
	
	public boolean insert(Film film) {
		if (film.getTitre() == null || film.getTitre().isEmpty()) {
			return false;
		}
		iFilmRepository.save(film);
		return true;
	}

	public void delete(Film film) {
		Optional<Film> opt = iFilmRepository.findById(film.getId());
		if (opt.isPresent()) {
			iFilmRepository.delete(opt.get());
		}
	}

}
