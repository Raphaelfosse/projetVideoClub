package metier;

import java.util.*;

import javax.persistence.*;

@Entity
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String titre; 
	private Date dateSortie;
	@OneToMany
	private Article article;
	@ManyToMany
	private Realisateur realisateur;
	
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
	
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Realisateur getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", dateSortie=" + dateSortie + ", article=" + article
				+ ", realisateur=" + realisateur + "]";
	}

	
	
	
}
