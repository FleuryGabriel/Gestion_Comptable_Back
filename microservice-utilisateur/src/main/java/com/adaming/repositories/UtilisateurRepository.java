package com.adaming.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Employe;
import com.adaming.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

	public Utilisateur findByLogin(String login);
	
	
	public List<Utilisateur> findByLoginContaining(String login);
	
	public List<Utilisateur> findByDeleted(boolean bool);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Utilisateur u WHERE u.employe.id=:idEmploye")
	public void deleteUtilisateurs(@Param("idEmploye")Long idEmploye);
	

}
