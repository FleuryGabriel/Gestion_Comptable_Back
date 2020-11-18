package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Ligne_Ecriture;
import com.adaming.service.Ligne_EcritureService;


@RestController
public class Ligne_EcritureController {
	
	@Autowired
	Ligne_EcritureService ligne_ecritureService;
	
	@RequestMapping(value="ligne_ecritures", method=RequestMethod.GET)
	public List<Ligne_Ecriture> findAll() {
		return ligne_ecritureService.findAll();
	}
	@RequestMapping(value="ligne_ecritures/{idLigne_Ecriture}", method=RequestMethod.GET)
	public Ligne_Ecriture findOne(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture) {
		return ligne_ecritureService.findOne(idLigne_Ecriture);
	}
	@RequestMapping(value="ligne_ecritures", method=RequestMethod.POST)
	public Ligne_Ecriture saveLigne_Ecriture(@RequestBody Ligne_Ecriture ligne_Ecriture) {
		return ligne_ecritureService.save(ligne_Ecriture);
	}
	@RequestMapping(value="ligne_ecritures/{idLigne_Ecriture}", method=RequestMethod.DELETE)
	public void deleteLigne_Ecriture(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture) {
		ligne_ecritureService.delete(idLigne_Ecriture);
	}
	@RequestMapping(value="ligne_ecritures/{idLigne_Ecriture}", method=RequestMethod.PUT)
	public Ligne_Ecriture updateLigne_Ecriture(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture, @RequestBody Ligne_Ecriture ligne_Ecriture) {
		Ligne_Ecriture currentLigne_Ecriture = ligne_ecritureService.findOne(idLigne_Ecriture);
		
		return ligne_ecritureService.save(currentLigne_Ecriture);
	}
	
	@RequestMapping(value="ligne_ecritures/{idLigne_Ecriture}", method=RequestMethod.PUT)
	public Ligne_Ecriture deletedLigne_Ecriture(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture, @RequestBody Ligne_Ecriture ligne_Ecriture) {
		
		Ligne_Ecriture currentLigne_Ecriture = ligne_ecritureService.findOne(idLigne_Ecriture);
		currentLigne_Ecriture.setIsDeleted(true);
		
		return ligne_ecritureService.save(currentLigne_Ecriture);
	}

}
