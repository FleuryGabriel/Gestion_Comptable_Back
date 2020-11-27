package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Employe;
import com.adaming.repositories.EmployeRepository;
import com.adaming.repositories.UtilisateurRepository;

@Service
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	private EmployeRepository eRep;
	@Autowired
	private UtilisateurRepository uRep;
	
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
		uRep.deleteUtilisateurs(id);
		eRep.deleteById(id);
	}

	@Override
	public List<Employe> findNotDeleted() {
		return eRep.findByDeleted(false);
	}

	
	
}
