package com.adaming.service;

import java.util.List;

import com.adaming.entities.Ligne_Ecriture;

public interface Ligne_EcritureService {

	List<Ligne_Ecriture> findAll();

	Ligne_Ecriture findOne(Long idLigne_Ecriture);

	Ligne_Ecriture save(Ligne_Ecriture ligne_Ecriture);

	void delete(Long idLigne_Ecriture);
}
