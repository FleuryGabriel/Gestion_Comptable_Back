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

import com.adaming.dto.Ligne_EcritureDTO;
import com.adaming.entities.Ligne_Ecriture;
import com.adaming.mapper.ILigne_EcritureMapper;
import com.adaming.service.Ligne_EcritureService;


@RestController
@CrossOrigin
public class Ligne_EcritureController {
	
	@Autowired
	Ligne_EcritureService ligne_ecritureService;
	@Autowired
	ILigne_EcritureMapper ligne_ecritureMapper;
	
	@GetMapping(value="/ligne_ecritures")
	public List<Ligne_EcritureDTO> findAll() {
		return (List<Ligne_EcritureDTO>) ligne_ecritureService.findAll().stream().map(e -> ligne_ecritureMapper.convertToLigne_EcritureDTO(e))
				.collect(Collectors.toList());
	}
	@GetMapping(value="/ligne_ecritures/{idLigne_Ecriture}")
	public Ligne_EcritureDTO findOne(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture) {
		return ligne_ecritureMapper.convertToLigne_EcritureDTO(ligne_ecritureService.findOne(idLigne_Ecriture));
	}
	@PostMapping(value="/ligne_ecritures")
	public Ligne_EcritureDTO saveLigne_Ecriture(@RequestBody Ligne_Ecriture ligne_Ecriture) {
		return ligne_ecritureMapper.convertToLigne_EcritureDTO(ligne_ecritureService.save(ligne_Ecriture));
	}
	@DeleteMapping(value="/ligne_ecritures/{idLigne_Ecriture}")
	public void deleteLigne_Ecriture(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture) {
		ligne_ecritureService.delete(idLigne_Ecriture);
	}
	
	@PutMapping(value="/ligne_ecritures/{idLigne_Ecriture}")
	public Ligne_EcritureDTO deletedLigne_Ecriture(@PathVariable("idLigne_Ecriture") Long idLigne_Ecriture) {
		
		Ligne_Ecriture currentLigne_Ecriture = ligne_ecritureService.findOne(idLigne_Ecriture);
		currentLigne_Ecriture.setIsDeleted(true);
		
		return ligne_ecritureMapper.convertToLigne_EcritureDTO(ligne_ecritureService.save(currentLigne_Ecriture));
	}

}
