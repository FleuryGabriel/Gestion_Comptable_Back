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

import com.adaming.entities.Employe;
import com.adaming.services.EmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	private EmployeService eServ;

	@GetMapping(value = "employes")
	public List<Employe> findAll() {
		return eServ.findAll();
	}

	@GetMapping(value = "employes/{pId}")
	public Employe findOne(@PathVariable("pId") Long id) {
		return eServ.findOne(id);
	}

	@PostMapping(value = "employes")
	public Employe saveEmploye(@RequestBody Employe rIn) {
		return eServ.saveEmploye(rIn);
	}

	@DeleteMapping(value = "employes/{pId}")
	public void deleteEmploye(@PathVariable("pId") Long id) {
		eServ.deleteEmploye(id);
	}
	
	@PutMapping(value = "employes/{pId}")
	public Employe deletedEmploye(@PathVariable("pId") Long id) {
		Employe out = eServ.findOne(id);
		out.setDeleted(true);
		return eServ.saveEmploye(out);
	}
	
}
