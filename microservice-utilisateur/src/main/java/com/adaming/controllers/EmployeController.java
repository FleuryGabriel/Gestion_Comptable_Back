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

import com.adaming.dto.EmployeDTO;
import com.adaming.entities.Employe;
import com.adaming.mappers.EmployeMapper;
import com.adaming.services.EmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	private EmployeService eServ;
	
	@Autowired
	private EmployeMapper eMap;

	@GetMapping(value = "employes")
	public List<EmployeDTO> findAll() {
		return eServ.findAll().stream().map(e -> eMap.convertToEmployeDTO(e)).collect(Collectors.toList());
	}

	@GetMapping(value = "employes/{pId}")
	public EmployeDTO findOne(@PathVariable("pId") Long id) {
		return eMap.convertToEmployeDTO(eServ.findOne(id));
	}

	@PostMapping(value = "employes")
	public EmployeDTO saveEmploye(@RequestBody Employe eIn) {
		return eMap.convertToEmployeDTO(eServ.saveEmploye(eIn));
	}

	@DeleteMapping(value = "employes/{pId}")
	public void deleteEmploye(@PathVariable("pId") Long id) {
		eServ.deleteEmploye(id);
	}
	
	@PutMapping(value = "employes/{pId}")
	public EmployeDTO deletedEmploye(@PathVariable("pId") Long id) {
		Employe out = eServ.findOne(id);
		out.setDeleted(true);
		return eMap.convertToEmployeDTO(eServ.saveEmploye(out));
	}
}
