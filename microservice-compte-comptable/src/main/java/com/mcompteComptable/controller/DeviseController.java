package com.mcompteComptable.controller;

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
import com.mcompteComptable.entities.Devise;
import com.mcompteComptable.service.DeviseService;

@RestController
@CrossOrigin
public class DeviseController {

	@Autowired
	DeviseService deviseService;
	
	@PostMapping(value="/devises")
	public Devise saveOrUpdate (@RequestBody Devise devise)
	{
		return deviseService.saveOrUpdate(devise);
	}
	@GetMapping(value="/devises/{id}")
	public Devise findOne (@PathVariable("id") Long id)
	{
		return deviseService.findOne(id);
		
	}
	@GetMapping (value="/devises")
	public List<Devise> findAllDevises()
	{
	return deviseService.findAll();
	}

	@DeleteMapping(value="/devises/{id}")
	public void deleteDevise(@PathVariable("id")Long id)
	{
		deviseService.delete(id);
	}
	@PutMapping(value="/devises/{id}")
	public Devise deletedDevise(@PathVariable("id")Long id) {
		Devise devise= deviseService.findOne(id);
		devise.setDeleted(true);
		return deviseService.saveOrUpdate(devise);
	}
}
