package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Article;
import repository.IArticleRepository;


public class TestArticle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		IArticleRepository iar = ctx.getBean(IArticleRepository.class);
		
		Article a = new Article();
		
		a.setNoArticle(2);
		a.setNbDisques(3);
	
		iar.save(a);	
		
		ctx.close();
	}
}


