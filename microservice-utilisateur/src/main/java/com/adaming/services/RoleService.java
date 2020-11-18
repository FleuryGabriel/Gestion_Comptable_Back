package com.adaming.services;

import java.util.List;

import com.adaming.entities.Role;

public interface RoleService {

	List<Role> findAll();
	Role findOne(Long id);
	Role saveRole(Role rIn);
	void deleteRole(Long id);

	
}
