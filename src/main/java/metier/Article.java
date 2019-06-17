package metier;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noArticle;
	private Integer nbDisques;
	@ManyToOne
	private Film film;
	@OneToMany
	private Adherent adherent;

	public Article() {
	}

	public Article(Integer noArticle, Integer nbDisques) {
		this.noArticle = noArticle;
		this.nbDisques = nbDisques;
	}

	
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
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
		return "Article [noArticle=" + noArticle + ", nbDisques=" + nbDisques + ", film=" + film + ", adherent="
				+ adherent + "]";
	}



}
