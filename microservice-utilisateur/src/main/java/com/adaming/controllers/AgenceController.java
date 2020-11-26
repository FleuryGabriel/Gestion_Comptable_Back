package com.adaming.controllers;

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

import com.adaming.dto.AgenceDTO;
import com.adaming.entities.Agence;
import com.adaming.mappers.AgenceMapper;
import com.adaming.services.AgenceService;

@RestController
@CrossOrigin
public class AgenceController {
	
	@Autowired
	private AgenceService aServ;
	
	@Autowired
	private AgenceMapper aMap;

	@GetMapping(value = "agences")
	public List<AgenceDTO> findAll() {
		return 	aServ.findAll().stream().map(a -> aMap.convertToAgenceDTO(a)).collect(Collectors.toList());

	}

	@GetMapping(value = "agences/{pId}")
	public AgenceDTO findOne(@PathVariable("pId") Long id) {
		return aMap.convertToAgenceDTO(aServ.findOne(id));
	}

	@PostMapping(value = "agences")
	public AgenceDTO saveAgence(@RequestBody Agence rIn) {
		return aMap.convertToAgenceDTO(aServ.saveAgence(rIn));
	}

	@DeleteMapping(value = "agences/{pId}")
	public void deleteAgence(@PathVariable("pId") Long id) {
		aServ.deleteAgence(id);
	}
	
	@PutMapping(value = "agences/{pId}")
	public AgenceDTO deletedAgence(@PathVariable("pId") Long id) {
		Agence out = aServ.findOne(id);
		out.setDeleted(true);
		return aMap.convertToAgenceDTO(aServ.saveAgence(out));
	}
	
	@GetMapping(value = "agencesNotDeleted")
	public List<AgenceDTO> findNotDeleted(){
		return aServ.findNotDeleted().stream().map(a -> aMap.convertToAgenceDTO(a)).collect(Collectors.toList());
	}
	
}
