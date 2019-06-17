package metier;

import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String titre; 
	private Date dateSortie;
	@OneToMany 
	private List<Article> articles;
	@OneToMany (mappedBy = "key.film")
	private List<FilmRealisateur> filmRealisateur;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	
	public List<FilmRealisateur> getFilmRealisateur() {
		return filmRealisateur;
	}
	public void setFilmRealisateur(List<FilmRealisateur> filmRealisateur) {
		this.filmRealisateur = filmRealisateur;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", dateSortie=" + dateSortie + ", article=" + articles
				+ ", realisateur= realisateurs  ]";
	}

	
	
	
}
