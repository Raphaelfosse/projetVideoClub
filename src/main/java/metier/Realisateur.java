package metier;

import javax.persistence.*;
import java.util.*;

@Entity
public class Realisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String prenom; 
	private String nom;
	@ManyToMany
	private List<Film> films;
	
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
	
	public List<Film> getFilms() {
		return films;
	}
	public void setFilms(List<Film> films) {
		this.films = films;
	}
	@Override
	public String toString() {
		return "Realisateur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", film=" + films + "]";
	}

	
	public void addFilm(Film f) {
		List<Film> l = getFilms();
		l.add(f);
		setFilms(l);
	}
	
}
