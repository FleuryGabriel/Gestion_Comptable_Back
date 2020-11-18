package com.adaming.services;

import java.util.List;

import com.adaming.entities.Utilisateur;

public interface UtilisateurService {

	List<Utilisateur> findAll();
	Utilisateur findOne(Long id);
	Utilisateur saveUtilisateur(Utilisateur uIn);
	void deleteUtilisateur(Long id);
	
}
