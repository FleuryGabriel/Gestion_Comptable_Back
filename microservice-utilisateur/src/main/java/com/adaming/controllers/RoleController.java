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

import com.adaming.dto.RoleDTO;
import com.adaming.entities.Role;
import com.adaming.mappers.RoleMapper;
import com.adaming.services.RoleService;

@RestController
@CrossOrigin
public class RoleController {
	
	@Autowired
	private RoleService rServ;
	
	@Autowired
	private RoleMapper rMap;

	@GetMapping(value = "roles")
	public List<RoleDTO> findAll() {
		return rServ.findAll().stream().map(e -> rMap.convertToRoleDTO(e)).collect(Collectors.toList());
	}

	@GetMapping(value = "roles/{pId}")
	public RoleDTO findOne(@PathVariable("pId") Long id) {
		return rMap.convertToRoleDTO(rServ.findOne(id));
	}

	@PostMapping(value = "roles")
	public RoleDTO saveRole(@RequestBody Role eIn) {
		return rMap.convertToRoleDTO(rServ.saveRole(eIn));
	}

	@DeleteMapping(value = "roles/{pId}")
	public void deleteRole(@PathVariable("pId") Long id) {
		rServ.deleteRole(id);
	}
	
	@PutMapping(value = "roles/{pId}")
	public RoleDTO deletedRole(@PathVariable("pId") Long id) {
		Role out = rServ.findOne(id);
		out.setDeleted(true);
		return rMap.convertToRoleDTO(rServ.saveRole(out));
	}
}
