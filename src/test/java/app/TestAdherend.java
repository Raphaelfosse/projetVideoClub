package app;

import org.springframework.context.support.*;

import metier.*;
import services.*;

public class TestAdherend {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		AdherentService adeService=ctx.getBean(AdherentService.class);
		Adherent ade = new Adherent();
		ade.setCivilite(ECivilite.na);
		ade.setNom("AZRTY");
		ade.setPrenom("TYU");
		
		adeService.insert(ade);
		adeService.delete(ade);
		
		ctx.close();

	}

}
