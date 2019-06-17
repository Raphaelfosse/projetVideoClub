package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Adherent;
import metier.Adresse;
import metier.Article;
import metier.ECivilite;
import metier.Film;
import metier.Realisateur;
import repository.IArticleRepository;
import repository.IFilmRepository;
import repository.IRealisateurRepository;
import services.AdherentService;
import services.FilmService;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

		AdherentService adeService=ctx.getBean(AdherentService.class);
		IArticleRepository iar = ctx.getBean(IArticleRepository.class);
		IFilmRepository ifr = ctx.getBean(IFilmRepository.class);
		IRealisateurRepository irr = ctx.getBean(IRealisateurRepository.class);
		FilmService fs = ctx.getBean(FilmService.class);
		
		
		Adherent ade = new Adherent();
		ade.setCivilite(ECivilite.na);
		ade.setNom("aaaaaaa");
		ade.setPrenom("bbbbb");
		Adresse adresse = new Adresse();
		adresse.setCodePostal("75006"); 
		adresse.setRue("rue rougemont");
		ade.setAdresse(adresse);
		
		Article a = new Article();
		a.setNoArticle(2);
		a.setNbDisques(3);
		a.setAdherents(ade);
		
		Film f = new Film();
		f.setTitre("Warcraft : le commencement");
	
		
		
		Realisateur r = new Realisateur();
		r.setNom("Tarentule");
		r.setPrenom("Jacque");
		r.setId(15);
		f.setId(4);
		System.out.println(r);
		System.out.println(f);
		fs.addRealisateur(f, r);
		ifr.save(f);	
		a.setFilm(f);
		iar.save(a);
		adeService.insert(ade);
		irr.save(r);
		ctx.close();
	}
}