package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metier.Adherent;
import metier.Article;
import repository.IArticleRepository;

@Service
public class ArticleService {
	@Autowired
	private IArticleRepository iArticleRepository;
	
	public boolean insert(Article article) {
		if (article.getNoArticle() == null) {
			return false;
		}
		iArticleRepository.save(article);
		return true;
	}
	
	public void delete(Article article) {
		Optional<Article> opt = iArticleRepository.findByIdWithNoArticle(article.getNoArticle());
		if (opt.isPresent()) {
			iArticleRepository.delete(opt.get());
		}
	}
}
