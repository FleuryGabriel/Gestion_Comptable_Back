package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Employe;
import com.adaming.repositories.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	private EmployeRepository eRep;
	
	@Override
	public List<Employe> findAll() {
		return eRep.findAll();
	}

	@Override
	public Employe findOne(Long id) {
		return eRep.getOne(id);
	}

	@Override
	public Employe saveEmploye(Employe eIn) {
		return eRep.save(eIn);
	}

	@Override
	public void deleteEmploye(Long id) {
		eRep.deleteById(id);
	}

	
	
}
