package com.mcompteComptable.controller;

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

import com.mcompteComptable.DTO.CompteComptableDTO;
import com.mcompteComptable.entities.CompteComptable;
import com.mcompteComptable.mapper.ICompteComptableMapper;
import com.mcompteComptable.service.CompteComptableService;

@RestController
@CrossOrigin
public class CompteComptableController {

	@Autowired
	CompteComptableService compteComptableService;
	
	@Autowired
	ICompteComptableMapper compteComptableMapper;
	
	@PostMapping(value="/compteComptables")
	public CompteComptableDTO saveOrUpdate (@RequestBody CompteComptable compteComptable)
	{
		return compteComptableMapper.convertToCompteComptableDTO(compteComptableService.saveOrUpdate(compteComptable));
	}
	@GetMapping(value="/compteComptables/{id}")
	public CompteComptableDTO findOne (@PathVariable("id") Long id)
	{
		return compteComptableMapper.convertToCompteComptableDTO(compteComptableService.findOne(id));
		
	}
	@GetMapping (value="/compteComptables")
	public List<CompteComptableDTO> findAllCompteComptables()
	{
	return (List<CompteComptableDTO>) compteComptableService.findAll().stream().map(c->compteComptableMapper.convertToCompteComptableDTO(c)).collect(Collectors.toList());
	}

	@DeleteMapping(value="/compteComptables/{id}")
	public void deleteCompteComptable(@PathVariable("id")Long id)
	{
		compteComptableService.delete(id);
	}
	@PutMapping(value="/compteComptables/{id}")
	public CompteComptableDTO deletedCompteComptable(@PathVariable("id") Long id) {
		CompteComptable compte= compteComptableService.findOne(id);
		compte.setDeleted(true);
		return compteComptableMapper.convertToCompteComptableDTO(compteComptableService.saveOrUpdate(compte));
		
	}
}
