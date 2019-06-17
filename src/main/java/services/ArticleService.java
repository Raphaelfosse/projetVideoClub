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
public class ArticleService {
	@Autowired
	private IArticleRepository iArticleRepository;

	@Autowired
	private IFilmRepository iFilmRepository;
	
	@Autowired
	private IAdherentRepository iadherentRepository;

	@Autowired
	private IArticleIFilmRepository iArticleiFilmRepository;

	
	public boolean insert(IArticle iarticle) {
		if (iarticle.getNom() == null || iarticle.getNom().isEmpty()) {
			return false;
		}
		iarticleRepository.save(iarticle);
		return true;
	}

	
	public void delete(IArticle soldat) {
		Optional<Soldat> opt = soldatRepository.findByIdWithGrades(soldat.getId());
		if (opt.isPresent()) {
			soldatRepository.delete(opt.get());
		}
	}

//	public void addGrade(Soldat soldat, Grade grade) {
//		Optional<Soldat> opt = soldatRepository.findByIdWithGrades(soldat.getId());
//		if (opt.isPresent()) {
//			SoldatGrade soldatGrade = new SoldatGrade();
//
//			soldatGrade.setKey(new SoldatGradeKey(opt.get(), gradeRepository.findById(grade.getId()).get()));
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			try {
//				soldatGrade.setDateAffectation(sdf.parse("10/02/2018"));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			soldatGradeRepository.save(soldatGrade);
//		}
//	}

}
