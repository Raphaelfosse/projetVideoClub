package app;

import org.springframework.context.support.*;

import dao.*;
import metier.*;

public class TestAdherend {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		DAOAdherent daoA=ctx.getBean(DAOAdherent.class);
		Adherent ade = new Adherent();
		ade.setCivilite(ECivilite.na);
		ade.setNom("AZRTY");
		ade.setNom("TYU");
		
		
		daoA.insert(ade);	
		
		ctx.close();

	}

}
