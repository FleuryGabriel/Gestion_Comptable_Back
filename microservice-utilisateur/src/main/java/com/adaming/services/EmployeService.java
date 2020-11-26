package com.adaming.services;

import java.util.List;

import com.adaming.entities.Employe;

public interface EmployeService {
	
	List<Employe> findAll();
	Employe findOne(Long id);
	Employe saveEmploye(Employe eIn);
	void deleteEmploye(Long id);
	public List<Employe> findNotDeleted();

}
