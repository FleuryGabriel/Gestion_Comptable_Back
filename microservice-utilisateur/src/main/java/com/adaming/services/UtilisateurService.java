package com.adaming.services;

import java.util.List;

import com.adaming.entities.Employe;
import com.adaming.entities.Utilisateur;

public interface UtilisateurService {

	List<Utilisateur> findAll();
	Utilisateur findOne(Long id);
	Utilisateur saveUtilisateur(Utilisateur uIn);
	void deleteUtilisateur(Long id);
	public Utilisateur findByLogin(String login);
	public Utilisateur authentifier(String login,String password);
	public List<Utilisateur> findWithLogin(String login);
	public List<Utilisateur> findNotDeleted();
	public void deleteUtilisateurs(Long idEmploye);
	
}
