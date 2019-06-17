package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.*;

public interface IAdherentRepository extends JpaRepository<Adherent, Integer> {

}
