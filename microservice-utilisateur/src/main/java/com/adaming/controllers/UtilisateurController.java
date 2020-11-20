package com.adaming.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.dto.UtilisateurDTO;
import com.adaming.entities.Utilisateur;
import com.adaming.mappers.UtilisateurMapper;
import com.adaming.services.UtilisateurService;

@RestController
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService uServ;
	
	@Autowired
	private UtilisateurMapper uMap;

	@GetMapping(value = "utilisateurs")
	public List<UtilisateurDTO> findAll() {
		return uServ.findAll().stream().map(e -> uMap.convertToUtilisateurDTO(e)).collect(Collectors.toList());
	}

	@GetMapping(value = "utilisateurs/{pId}")
	public UtilisateurDTO findOne(@PathVariable("pId") Long id) {
		return uMap.convertToUtilisateurDTO(uServ.findOne(id));
	}

	@PostMapping(value = "utilisateurs")
	public UtilisateurDTO saveUtilisateur(@RequestBody Utilisateur eIn) {
		return uMap.convertToUtilisateurDTO(uServ.saveUtilisateur(eIn));
	}

	@DeleteMapping(value = "utilisateurs/{pId}")
	public void deleteUtilisateur(@PathVariable("pId") Long id) {
		uServ.deleteUtilisateur(id);
	}
	
	@PutMapping(value = "utilisateurs/{pId}")
	public UtilisateurDTO deletedUtilisateur(@PathVariable("pId") Long id) {
		Utilisateur out = uServ.findOne(id);
		out.setDeleted(true);
		return uMap.convertToUtilisateurDTO(uServ.saveUtilisateur(out));
	}

}
