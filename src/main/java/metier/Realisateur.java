package metier;

import javax.persistence.*;

@Entity
public class Realisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String prenom; 
	private String nom;
	@ManyToMany
	private Film film;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	@Override
	public String toString() {
		return "Realisateur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", film=" + film + "]";
	}

	
	
	
}
