package app;

import org.springframework.context.support.*;

import metier.*;
import services.*;

public class TestAdherend {

	public static void main(String[] args) {
		initation();

	}
	
	public static void initation(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		AdherentService adeService=ctx.getBean(AdherentService.class);
		Adherent ade = new Adherent();
		ade.setCivilite(ECivilite.na);
		ade.setNom("aaaaaaa");
		ade.setPrenom("bbbbb");
		Adresse adresse = new Adresse();
		adresse.setCodePostal("75006");
		adresse.setRue("rue rougemont");
		ade.setAdresse(adresse);
		
		Adherent ade1 = new Adherent();
		ade1.setNom("ccccc");
		ade1.setPrenom("dddddd");
		ade1.setCivilite(ECivilite.mr);
		
		Adherent ade2 = new Adherent();
		ade2.setNom("eeeeeee");
		ade2.setPrenom("fffffff");
		ade2.setCivilite(ECivilite.mme);
		
		adeService.insert(ade2);
		adeService.insert(ade1);
		adeService.insert(ade);
	
		ctx.close();
	}
	
	public static void suppTest(){
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
