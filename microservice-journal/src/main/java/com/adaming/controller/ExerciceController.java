package com.adaming.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.dto.ExerciceDTO;
import com.adaming.entities.Exercice;
import com.adaming.mapper.IExerciceMapper;
import com.adaming.service.ExerciceService;

@RestController
@CrossOrigin
public class ExerciceController {
	
	@Autowired
	ExerciceService exerciceService;
	@Autowired
	IExerciceMapper exerciceMapper;
	
	@GetMapping(value="/exercices")
	public List<ExerciceDTO> findAll() {
		return (List<ExerciceDTO>) exerciceService.findAll().stream().map(e -> exerciceMapper.convertToExerciceDTO(e))
				.collect(Collectors.toList());
	}
	@GetMapping(value="/exercices/{idExercice}")
	public ExerciceDTO findOne(@PathVariable("idExercice") Long idExercice) {
		return exerciceMapper.convertToExerciceDTO(exerciceService.findOne(idExercice));
	}
	@PostMapping(value="/exercices")
	public ExerciceDTO saveExercice(@RequestBody Exercice exercice) {
		return exerciceMapper.convertToExerciceDTO(exerciceService.save(exercice));
	}
	@DeleteMapping(value="/exercices/{idExercice}")
	public void deleteExercice(@PathVariable("idExercice") Long idExercice) {
		exerciceService.delete(idExercice);
	}
	
	@PutMapping(value="/exercices/{idExercice}")
	public ExerciceDTO deletedExercice(@PathVariable("idExercice") Long idExercice, @RequestBody Exercice exercice) {
		
		Exercice currentExercice = exerciceService.findOne(idExercice);
		currentExercice.setIsDeleted(true);
		
		return exerciceMapper.convertToExerciceDTO(exerciceService.save(currentExercice));
	}

}
