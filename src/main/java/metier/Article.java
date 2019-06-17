package metier;

@Entity
public class Article {

	private Integer noArticle;
	private Integer nbDisques;
	
	public Article (){	
	}

	public Article(Integer noArticle, Integer nbDisques) {
		super();
		this.noArticle = noArticle;
		this.nbDisques = nbDisques;
	}

	public Integer getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}

	public Integer getNbDisques() {
		return nbDisques;
	}

	public void setNbDisques(Integer nbDisques) {
		this.nbDisques = nbDisques;
	}

	@Override
	public String toString() {
		return "Article [noArticle=" + noArticle + ", nbDisques=" + nbDisques + "]";
	}
	
	
	
}
