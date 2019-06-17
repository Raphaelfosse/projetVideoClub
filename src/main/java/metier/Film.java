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
	private List<Article> articles;
	@ManyToMany
	private List<Realisateur> realisateurs;
	
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
	public List<Realisateur> getRealisateurs() {
		return realisateurs;
	}
	public void setRealisateurs(List<Realisateur> realisateurs) {
		this.realisateurs = realisateurs;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", dateSortie=" + dateSortie + ", article=" + articles
				+ ", realisateur=" + realisateurs + "]";
	}

	public void addRealisateur(Realisateur r) {
		List<Realisateur> l = getRealisateurs();
		l.add(r);
		setRealisateurs(l);
	}
	
	
}
