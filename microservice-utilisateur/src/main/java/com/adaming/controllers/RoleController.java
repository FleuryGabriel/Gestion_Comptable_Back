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

import com.adaming.entities.Role;
import com.adaming.services.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService rServ;
	
	@GetMapping(value = "roles")
	public List<Role> findAll() {
		return rServ.findAll();
	}

	@GetMapping(value = "roles/{pId}")
	public Role findOne(@PathVariable("pId") Long id) {
		return rServ.findOne(id);
	}

	@PostMapping(value = "roles")
	public Role saveRole(@RequestBody Role rIn) {
		return rServ.saveRole(rIn);
	}

	@DeleteMapping(value = "roles/{pId}")
	public void deleteRole(@PathVariable("pId") Long id) {
		rServ.deleteRole(id);
	}
	
	@PutMapping(value = "roles/{pId}")
	public Role deletedRole(@PathVariable("pId") Long id) {
		Role out = rServ.findOne(id);
		out.setDeleted(true);
		return rServ.saveRole(out);
	}

}
