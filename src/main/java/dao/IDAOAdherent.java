package dao;

import java.util.*;

import metier.*;

public interface IDAOAdherent extends DAO<Adherent, Integer>{
	public List<Adherent> selectAllWithDVD();
	public List<Adherent> selectAllWithBluRay();
	public List<Adherent> selectAllWithFilm();
	public List<Adherent> selectAllWithRealisateur();
	public List<Adherent> selectAllWithAdresseId(Integer id);
	public List<Adherent> selectAllWithCodePostal(String codePostal);
	

}
