package com.adaming.mappers;

import com.adaming.dto.RoleDTO;
import com.adaming.entities.Role;

public interface RoleMapper {

	RoleDTO convertToRoleDTO(Role aIn);
	
	Role convertToRole(RoleDTO aDTO);
	
}
