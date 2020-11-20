package com.adaming.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.adaming.dto.RoleDTO;
import com.adaming.entities.Role;
@Component
public class RoleMapperImpl implements RoleMapper{

ModelMapper modelMapper = new ModelMapper();
	

	@Override
	public RoleDTO convertToRoleDTO(Role rIn) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		RoleDTO rDTO = modelMapper.map(rIn, RoleDTO.class);
		return rDTO;
	}

	@Override
	public Role convertToRole(RoleDTO rDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Role rIn = modelMapper.map(rDTO, Role.class);
		return rIn;
	}

}
