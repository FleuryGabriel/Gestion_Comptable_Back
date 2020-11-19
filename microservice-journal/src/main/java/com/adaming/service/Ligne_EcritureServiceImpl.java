package com.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Ligne_Ecriture;
import com.adaming.repositories.Ligne_EcritureRepository;

@Service
public class Ligne_EcritureServiceImpl implements Ligne_EcritureService{
	
	@Autowired
	Ligne_EcritureRepository ligne_EcritureRepository;

	@Override
	public List<Ligne_Ecriture> findAll() {
		return ligne_EcritureRepository.findAll();
	}

	@Override
	public Ligne_Ecriture findOne(Long idLigne_Ecriture) {
		return ligne_EcritureRepository.getOne(idLigne_Ecriture);
	}

	@Override
	public Ligne_Ecriture save(Ligne_Ecriture ligne_Ecriture) {
		return ligne_EcritureRepository.save(ligne_Ecriture);
	}

	@Override
	public void delete(Long idLigne_Ecriture) {
		ligne_EcritureRepository.deleteById(idLigne_Ecriture);
		
	}

}
