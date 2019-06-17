package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import metier.*;

public interface IAdherentRepository extends JpaRepository<Adherent, Integer> {
	@Query("select s from Adherent s left join fetch s.adresse where s.id=:id")
	public Optional<Adherent> findByIdWithAdresse(@Param("id") Integer id);

}
