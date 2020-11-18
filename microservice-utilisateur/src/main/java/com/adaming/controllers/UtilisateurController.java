package com.adaming.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Utilisateur;
import com.adaming.services.UtilisateurService;

@RestController
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService uServ;
	
	@GetMapping(value = "utilisateurs")
	public List<Utilisateur> findAll() {
		return uServ.findAll();
	}

	@GetMapping(value = "utilisateurs/{pId}")
	public Utilisateur findOne(@PathVariable("pId") Long id) {
		return uServ.findOne(id);
	}

	@PostMapping(value = "utilisateurs")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur rIn) {
		return uServ.saveUtilisateur(rIn);
	}

	@DeleteMapping(value = "utilisateurs/{pId}")
	public void deleteUtilisateur(@PathVariable("pId") Long id) {
		uServ.deleteUtilisateur(id);
	}
	
	@PutMapping(value = "utilisateurs/{pId}")
	public Utilisateur deletedUtilisateur(@PathVariable("pId") Long id) {
		Utilisateur out = uServ.findOne(id);
		out.setDeleted(true);
		return uServ.saveUtilisateur(out);
	}

}
