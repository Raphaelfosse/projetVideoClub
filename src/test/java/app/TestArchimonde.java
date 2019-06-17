package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DAOFilm;
import dao.DAORealisateur;
import metier.Film;
import metier.Realisateur;

public class TestArchimonde {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		DAOFilm daoF = ctx.getBean(DAOFilm.class);
		DAORealisateur daoR = ctx.getBean(DAORealisateur.class);
		
		Film f = new Film();
		Realisateur r = new Realisateur();
		
		f.setTitre("Warcraft : le commencement");
		r.setNom("Jones");
		r.setPrenom("Duncan");
		
		f.addRealisateur(r);
		r.addFilm(f);
		
		daoF.insert(f);
		daoR.insert(r);
		
		ctx.close();
	}
}
