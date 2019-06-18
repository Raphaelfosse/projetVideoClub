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
import services.ArticleService;
import services.FilmService;
import services.RealisateurService;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

		AdherentService adeService=ctx.getBean(AdherentService.class);
		IArticleRepository iar = ctx.getBean(IArticleRepository.class);
		IFilmRepository ifr = ctx.getBean(IFilmRepository.class);
		IRealisateurRepository irr = ctx.getBean(IRealisateurRepository.class);
		FilmService fs = ctx.getBean(FilmService.class);
		ArticleService as = ctx.getBean(ArticleService.class);
		RealisateurService rs = ctx.getBean(RealisateurService.class);
		
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
		adeService.insert(ade);
		as.insert(a);
		
		Film f = new Film();
		f.setTitre("Warcraft : le commencement");
		fs.insert(f);
		
		Realisateur r = new Realisateur();
		r.setNom("Tarentule");
		r.setPrenom("Jacque");
		rs.insert(r);
		
		fs.addRealisateur(f, r);
		a.setFilm(f);
		iar.save(a);
		
		ctx.close();
	}
}