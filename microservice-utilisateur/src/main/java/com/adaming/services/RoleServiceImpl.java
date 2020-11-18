package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Role;
import com.adaming.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository rRep;
	
	@Override
	public List<Role> findAll() {
		return rRep.findAll();
	}

	@Override
	public Role findOne(Long id) {
		return rRep.getOne(id);
	}

	@Override
	public Role saveRole(Role rIn) {
		return rRep.save(rIn);
	}

	@Override
	public void deleteRole(Long id) {
		rRep.deleteById(id);
	}

}
