package com.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Exercice;
import com.adaming.repositories.ExerciceRepository;

@Service
public class ExerciceServiceImpl implements ExerciceService{
	
	@Autowired
	ExerciceRepository exerciceRepository;

	@Override
	public List<Exercice> findAll() {
		return exerciceRepository.findAll();
	}

	@Override
	public Exercice findOne(Long idExercice) {
		return exerciceRepository.getOne(idExercice);
	}

	@Override
	public Exercice save(Exercice exercice) {
		return exerciceRepository.save(exercice);
	}

	@Override
	public void delete(Long idExercice) {
		exerciceRepository.deleteById(idExercice);
		
	}

}
