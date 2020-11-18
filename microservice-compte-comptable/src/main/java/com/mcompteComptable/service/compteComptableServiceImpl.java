package com.mcompteComptable.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcompteComptable.entities.CompteComptable;
import com.mcompteComptable.repositories.CompteComptableRepository;

@Service
public class compteComptableServiceImpl implements CompteComptableService {

	@Autowired
	CompteComptableRepository compteComptableRepository;
	@Override
	public CompteComptable saveOrUpdate(CompteComptable compteComptable) {
		return compteComptableRepository.save(compteComptable);
	}

	@Override
	public void delete(Long id) {
	compteComptableRepository.deleteById(id);
		
	}

	@Override
	public List<CompteComptable> findAll() {
			return compteComptableRepository.findAll();
	}

	@Override
	public CompteComptable findOne (Long id) {
		return compteComptableRepository.getOne(id);
	}



}
