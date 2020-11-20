package com.mcompteComptable.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mcompteComptable.DTO.DeviseDTO;
import com.mcompteComptable.entities.Devise;
@Component
public class DeviseMapper implements IDeviseMapper{
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public DeviseDTO convertToCompteComptableDTO(Devise devise) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		DeviseDTO deviseDTO=modelMapper.map(devise, DeviseDTO.class);
		return deviseDTO;
	}

	@Override
	public Devise convertToEmploye(DeviseDTO deviseDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Devise devise=modelMapper.map(deviseDTO, Devise.class);
		return devise;
	}

}
