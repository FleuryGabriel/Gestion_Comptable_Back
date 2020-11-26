package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Agence;
import com.adaming.repositories.AgenceRepository;

@Service
public class AgenceServiceImpl implements AgenceService{

	@Autowired
	private AgenceRepository aRep;
	
	@Override
	public List<Agence> findAll() {
		return aRep.findAll();
	}

	@Override
	public Agence findOne(Long id) {
		return aRep.getOne(id);
	}

	@Override
	public Agence saveAgence(Agence aIn) {
		return aRep.save(aIn);
	}

	@Override
	public void deleteAgence(Long id) {
		aRep.deleteById(id);
	}

	@Override
	public List<Agence> findNotDeleted() {
		return aRep.findByDeleted(false);
	}

}
