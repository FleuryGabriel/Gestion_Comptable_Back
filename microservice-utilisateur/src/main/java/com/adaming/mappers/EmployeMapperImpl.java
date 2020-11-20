package com.adaming.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.adaming.dto.EmployeDTO;
import com.adaming.entities.Employe;
@Component
public class EmployeMapperImpl implements EmployeMapper{

	ModelMapper modelMapper = new ModelMapper();

	@Override
	public EmployeDTO convertToEmployeDTO(Employe eIn) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		EmployeDTO eDTO = modelMapper.map(eIn, EmployeDTO.class);
		return eDTO;
	}

	@Override
	public Employe convertToEmploye(EmployeDTO eDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Employe eIn = modelMapper.map(eDTO, Employe.class);
		return eIn;
	}

}
