package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Article;
import repository.IArticleRepository;


public class TestArticle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		

		ctx.close();
	}
}


