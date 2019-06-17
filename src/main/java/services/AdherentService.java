package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metier.*;
import repository.*;
import dao.*;

@Service
public class AdherentService {
	@Autowired
	private IAdherentRepository adherentRepository;

	public boolean insert(Adherent adherent) {
		if (adherent.getNom() == null || adherent.getNom().isEmpty()) {
			return false;
		}
		adherentRepository.save(adherent);
		return true;
	}

	public void delete(Adherent adherent) {
		Optional<Adherent> opt = adherentRepository.findByIdWithAdresse(adherent.getNoAdherent());
		if (opt.isPresent()) {
			adherentRepository.delete(opt.get());
		}
	}

}
