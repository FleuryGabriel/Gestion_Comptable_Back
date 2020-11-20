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

import com.mcompteComptable.DTO.DeviseDTO;
import com.mcompteComptable.entities.Devise;
import com.mcompteComptable.mapper.IDeviseMapper;
import com.mcompteComptable.service.DeviseService;

@RestController
@CrossOrigin
public class DeviseController {

	@Autowired
	DeviseService deviseService;
	@Autowired
	IDeviseMapper deviseMapper;
	
	@PostMapping(value="/devises")
	public DeviseDTO saveOrUpdate (@RequestBody Devise devise)
	{
		return deviseMapper.convertToCompteComptableDTO(deviseService.saveOrUpdate(devise));
	}
	@GetMapping(value="/devises/{id}")
	public DeviseDTO findOne (@PathVariable("id") Long id)
	{
		return deviseMapper.convertToCompteComptableDTO(deviseService.findOne(id));
		
	}
	@GetMapping (value="/devises")
	public List<DeviseDTO> findAllDevises()
	{
	return (List<DeviseDTO>) deviseService.findAll().stream().map(d->deviseMapper.convertToCompteComptableDTO(d)).collect(Collectors.toList());
	}

	@DeleteMapping(value="/devises/{id}")
	public void deleteDevise(@PathVariable("id")Long id)
	{
		deviseService.delete(id);
	}
	@PutMapping(value="/devises/{id}")
	public DeviseDTO deletedDevise(@PathVariable("id")Long id) {
		Devise devise= deviseService.findOne(id);
		devise.setDeleted(true);
		return deviseMapper.convertToCompteComptableDTO(deviseService.saveOrUpdate(devise));
	}
}
