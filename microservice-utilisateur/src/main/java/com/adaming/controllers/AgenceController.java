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

import com.adaming.entities.Agence;
import com.adaming.services.AgenceService;

@RestController
public class AgenceController {
	
	@Autowired
	private AgenceService aServ;

	@GetMapping(value = "agences")
	public List<Agence> findAll() {
		return aServ.findAll();
	}

	@GetMapping(value = "agences/{pId}")
	public Agence findOne(@PathVariable("pId") Long id) {
		return aServ.findOne(id);
	}

	@PostMapping(value = "agences")
	public Agence saveAgence(@RequestBody Agence rIn) {
		return aServ.saveAgence(rIn);
	}

	@DeleteMapping(value = "agences/{pId}")
	public void deleteAgence(@PathVariable("pId") Long id) {
		aServ.deleteAgence(id);
	}
	
	@PutMapping(value = "agences/{pId}")
	public Agence deletedAgence(@PathVariable("pId") Long id) {
		Agence out = aServ.findOne(id);
		out.setDeleted(true);
		return aServ.saveAgence(out);
	}
	
}
