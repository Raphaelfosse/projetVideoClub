package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Film;
import repository.IFilmRepository;

public class TestArchimonde {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		IFilmRepository ifr = ctx.getBean(IFilmRepository.class);
		
		Film f = new Film();
		
		
		f.setTitre("Warcraft : le commencement");
	
		ifr.save(f);	
		
		ctx.close();
	}
}
