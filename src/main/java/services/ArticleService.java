package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


//	public void addArticle(Article article) {
//		Optional<Article> opt = iArticleRepository.findByIdWithArticle(article.getNoArticle());
//		if (opt.isPresent()) {
//			Article article = new Article();
//			
//
//			articlefilm.setKey(new ArticleFilmKey(opt.get(), filmRepository.findById(film.getId()).get()));
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			try {
//				soldatGrade.setDateAffectation(sdf.parse("10/02/2018"));
//			} catch (ParseException e) {
//				
//				e.printStackTrace();
//			}
//			soldatGradeRepository.save(soldatGrade);
//		}
//	}

}
