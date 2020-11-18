package com.mcompteComptable.service;

import java.util.List;

import com.mcompteComptable.entities.CompteComptable;

public interface CompteComptableService {

	public CompteComptable saveOrUpdate (CompteComptable CompteComptable);
	public void delete (Long id);
	public List<CompteComptable> findAll();
	public CompteComptable findOne (Long id);
	
}
