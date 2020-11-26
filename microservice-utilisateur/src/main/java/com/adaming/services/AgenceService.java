package com.adaming.services;

import java.util.List;

import com.adaming.entities.Agence;

public interface AgenceService {
	
	List<Agence> findAll();
	Agence findOne(Long id);
	Agence saveAgence(Agence aIn);
	void deleteAgence(Long id);
	List<Agence> findNotDeleted();

}
