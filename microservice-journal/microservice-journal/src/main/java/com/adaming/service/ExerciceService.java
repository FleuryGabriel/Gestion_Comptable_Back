package com.adaming.service;

import java.util.List;

import com.adaming.entities.Exercice;

public interface ExerciceService {
	List<Exercice> findAll();
	
	Exercice findOne(Long idExercice);
	
	Exercice save(Exercice exercice);
	
	void delete(Long idExercice);	

}
