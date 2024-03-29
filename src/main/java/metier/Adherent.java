package metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
// @NamedQueries({
// @NamedQuery(name = "Adherent.selectAllWithFilm", query = "select a from
// Adherent a left join fetch a.film")})

public class Adherent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noAdherent;
	@Enumerated(EnumType.STRING)
	private ECivilite civilite;
	private String prenom;
	private String nom;

	@Embedded
	private Adresse adresse;
	@OneToMany(mappedBy="adherents")
	private List<Article> article = new ArrayList<>();
	
	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}



	public Adherent() {

	}

	public Integer getNoAdherent() {
		return noAdherent;
	}

	public void setNoAdherent(Integer noAdherent) {
		this.noAdherent = noAdherent;
	}

	public ECivilite getCivilite() {
		return civilite;
	}

	public void setCivilite(ECivilite civilite) {
		this.civilite = civilite;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Adherent [noAdherent=" + noAdherent + ", civilite=" + civilite + ", prenom=" + prenom + ", nom=" + nom
				+ ", adresse=" + adresse + "]";
	}

}
