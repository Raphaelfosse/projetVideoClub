package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DAOArticle;
import metier.Article;


public class TestArticle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		DAOArticle daoA=ctx.getBean(DAOArticle.class);
		Article article1=new Article();
		article1.setNbDisques(10);
		article1.setNoArticle(20);
		
		daoA.insert(article1);	
		
		ctx.close();
	}

}
