package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.IRealisateurRepository;

@Service
public class RealisateurService {
	@Autowired
	private IRealisateurRepository realisateurRepository;
	
}
