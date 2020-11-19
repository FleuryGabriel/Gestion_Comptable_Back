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

import com.adaming.entities.Ligne_Ecriture;
import com.adaming.service.Ligne_EcritureService;


@RestController
@CrossOrigin
public class Ligne_EcritureController {
	
	@Autowired
	Ligne_EcritureService ligne_ecritureService;
	
	@GetMapping(value="/ligne_ecritures")
	public List<Ligne_Ecriture> findAll() {
		return ligne_ecritureService.findAll();
	}
	@GetMapping(value="/ligne_ecritures/{idLigne_Ecriture}")
	public Ligne_Ecriture findOne(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture) {
		return ligne_ecritureService.findOne(idLigne_Ecriture);
	}
	@PostMapping(value="/ligne_ecritures")
	public Ligne_Ecriture saveLigne_Ecriture(@RequestBody Ligne_Ecriture ligne_Ecriture) {
		return ligne_ecritureService.save(ligne_Ecriture);
	}
	@DeleteMapping(value="/ligne_ecritures/{idLigne_Ecriture}")
	public void deleteLigne_Ecriture(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture) {
		ligne_ecritureService.delete(idLigne_Ecriture);
	}
	
	@PutMapping(value="/ligne_ecritures/{idLigne_Ecriture}")
	public Ligne_Ecriture deletedLigne_Ecriture(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture, @RequestBody Ligne_Ecriture ligne_Ecriture) {
		
		Ligne_Ecriture currentLigne_Ecriture = ligne_ecritureService.findOne(idLigne_Ecriture);
		currentLigne_Ecriture.setIsDeleted(true);
		
		return ligne_ecritureService.save(currentLigne_Ecriture);
	}

}
