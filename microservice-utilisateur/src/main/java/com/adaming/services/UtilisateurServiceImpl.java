package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Utilisateur;
import com.adaming.repositories.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{

	@Autowired
	private UtilisateurRepository uRep;
	
	@Override
	public List<Utilisateur> findAll() {
		return uRep.findAll();
	}

	@Override
	public Utilisateur findOne(Long id) {
		return uRep.getOne(id);
	}

	@Override
	public Utilisateur saveUtilisateur(Utilisateur uIn) {
		return uRep.save(uIn);
	}

	@Override
	public void deleteUtilisateur(Long id) {
		uRep.deleteById(id);
	}

}
