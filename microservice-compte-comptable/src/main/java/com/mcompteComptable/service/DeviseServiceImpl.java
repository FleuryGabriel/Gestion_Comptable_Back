package com.mcompteComptable.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcompteComptable.entities.Devise;
import com.mcompteComptable.repositories.DeviseRepository;

@Service
public class DeviseServiceImpl implements DeviseService {

	@Autowired
	DeviseRepository deviseRepository;
	@Override
	public Devise saveOrUpdate(Devise devise) {
		return deviseRepository.save(devise);
	}

	@Override
	public void delete(Long id) {
	deviseRepository.deleteById(id);
		
	}

	@Override
	public List<Devise> findAll() {
			return deviseRepository.findAll();
	}

	@Override
	public Devise findOne(Long id) {
		return deviseRepository.getOne(id);
	}


}
