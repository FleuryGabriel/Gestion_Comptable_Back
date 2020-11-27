package com.adaming.controllers;

import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.adaming.dto.EmployeDTO;
import com.adaming.entities.Agence;
import com.adaming.entities.Employe;
import com.adaming.mappers.EmployeMapper;
import com.adaming.services.EmployeService;

@RestController
@CrossOrigin
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

//	@PostMapping(value = "employes")
//	public String saveEmploye(@RequestParam("nom") String nom,@RequestParam("prenom") String prenom, 
//			@RequestParam("dateNaissance") Date dateNaissance,@RequestParam("cin")Long cin,
//			@RequestParam("email" )String email,@RequestParam("tel")Long tel,@RequestParam("salaire")float salaire,
//			@RequestParam("agence")Agence agence,@RequestParam("file") MultipartFile file) {
//		try {
//			Employe emp=new Employe();
//			emp.setNom(nom);
//			emp.setPrenom(prenom);
//			emp.setDateNaissance(dateNaissance);
//			emp.setCin(cin);
//			emp.setEmail(email);
//			emp.setTel(tel);
//			emp.setSalaire(salaire);
//			emp.setAgence(agence);			
//			emp.setPhoto(file.getBytes());
//			eServ.saveEmploye(emp);
//			return "File uploaded successfully! filename = " + file.getOriginalFilename();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "Fail! Max file size = 500kB";
//		}
//	}
	
	@PostMapping(value = "employes")
	public EmployeDTO saveEmploye(@RequestBody Employe eIN) {
		return eMap.convertToEmployeDTO(eServ.saveEmploye(eIN));
				
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

	@GetMapping(value = "/employesNotDeleted")
	public List<EmployeDTO> findNotDeleted() {
		return eServ.findNotDeleted().stream().map(e -> eMap.convertToEmployeDTO(e)).collect(Collectors.toList());
	}
}
