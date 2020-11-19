package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Exercice;
import com.adaming.service.ExerciceService;

@RestController
@CrossOrigin
public class ExerciceController {
	
	@Autowired
	ExerciceService exerciceService;
	
	@GetMapping(value="/exercices")
	public List<Exercice> findAll() {
		return exerciceService.findAll();
	}
	@GetMapping(value="/exercices/{idExercice}")
	public Exercice findOne(@PathVariable("idExercice") Long idExercice) {
		return exerciceService.findOne(idExercice);
	}
	@PostMapping(value="/exercices")
	public Exercice saveExercice(@RequestBody Exercice exercice) {
		return exerciceService.save(exercice);
	}
	@DeleteMapping(value="/exercices/{idExercice}")
	public void deleteExercice(@PathVariable("idExercice") Long idExercice) {
		exerciceService.delete(idExercice);
	}
	
	@PutMapping(value="/exercices/{idExercice}")
	public Exercice deletedExercice(@PathVariable("idExercice") Long idExercice, @RequestBody Exercice exercice) {
		
		Exercice currentExercice = exerciceService.findOne(idExercice);
		currentExercice.setIsDeleted(true);
		
		return exerciceService.save(currentExercice);
	}

}
