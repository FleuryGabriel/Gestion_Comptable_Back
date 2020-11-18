package com.mcompteComptable.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcompteComptable.entities.CompteComptable;
import com.mcompteComptable.service.CompteComptableService;

@RestController
@CrossOrigin
@RequestMapping("/compte")
public class CompteComptableController {

	@Autowired
	CompteComptableService compteComptableService;
	
	@PostMapping(value="/save")
	public CompteComptable saveOrUpdate (@RequestBody CompteComptable compteComptable)
	{
		return compteComptableService.saveOrUpdate(compteComptable);
	}
	@GetMapping(value="/findOne/{id}")
	public CompteComptable findOne (@PathVariable("id") Long id)
	{
		return compteComptableService.findOne(id);
		
	}
	@GetMapping (value="/compteComptables")
	public List<CompteComptable> findAllCompteComptables()
	{
	return compteComptableService.findAll();
	}

	@DeleteMapping(value="/delete/{id}")
	public void deleteCompteComptable(@PathVariable("id")Long id)
	{
		compteComptableService.delete(id);
	}
	@PutMapping(value="/deleted/{id}")
	public CompteComptable deletedCompteComptable(@PathVariable("id") Long id) {
		CompteComptable compte= compteComptableService.findOne(id);
		compte.setDeleted(true);
		return compteComptableService.saveOrUpdate(compte);
		
	}
}
