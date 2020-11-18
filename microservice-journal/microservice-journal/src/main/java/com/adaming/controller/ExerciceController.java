package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Exercice;
import com.adaming.service.ExerciceService;

@RestController
public class ExerciceController {
	
	@Autowired
	ExerciceService exerciceService;
	
	@RequestMapping(value="exercices", method=RequestMethod.GET)
	public List<Exercice> findAll() {
		return exerciceService.findAll();
	}
	@RequestMapping(value="exercices/{idExercice}", method=RequestMethod.GET)
	public Exercice findOne(@PathVariable("idExercice") Long idExercice) {
		return exerciceService.findOne(idExercice);
	}
	@RequestMapping(value="exercices", method=RequestMethod.POST)
	public Exercice saveExercice(@RequestBody Exercice exercice) {
		return exerciceService.save(exercice);
	}
	@RequestMapping(value="exercices/{idExercice}", method=RequestMethod.DELETE)
	public void deleteExercice(@PathVariable("idExercice") Long idExercice) {
		exerciceService.delete(idExercice);
	}
	@RequestMapping(value="exercices/{idExercice}", method=RequestMethod.PUT)
	public Exercice updateExercice(@PathVariable("idExercice") Long idExercice, @RequestBody Exercice exercice) {
		Exercice currentExercice = exerciceService.findOne(idExercice);
		
		return exerciceService.save(currentExercice);
	}
	
	@RequestMapping(value="exercices/{idExercice}", method=RequestMethod.PUT)
	public Exercice deletedExercice(@PathVariable("idExercice") Long idExercice, @RequestBody Exercice exercice) {
		
		Exercice currentExercice = exerciceService.findOne(idExercice);
		currentExercice.setIsDeleted(true);
		
		return exerciceService.save(currentExercice);
	}

}
