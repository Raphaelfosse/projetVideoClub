package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metier.Adherent;
import metier.Realisateur;
import repository.IRealisateurRepository;

@Service
public class RealisateurService {
	@Autowired
	private IRealisateurRepository realisateurRepository;
	
	public boolean insert(Realisateur realisateur) {
		if (realisateur.getNom() == null || realisateur.getNom().isEmpty()) {
			return false;
		}
		realisateurRepository.save(realisateur);
		return true;
	}

	public void delete(Realisateur realisateur) {
		Optional<Realisateur> opt = realisateurRepository.findById(realisateur.getId());
		if (opt.isPresent()) {
			realisateurRepository.delete(opt.get());
		}
	}
}
