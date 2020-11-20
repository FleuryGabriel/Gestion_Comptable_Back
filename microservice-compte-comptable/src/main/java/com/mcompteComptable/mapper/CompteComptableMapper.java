package com.mcompteComptable.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mcompteComptable.DTO.CompteComptableDTO;
import com.mcompteComptable.entities.CompteComptable;

@Component
public class CompteComptableMapper implements ICompteComptableMapper{
	ModelMapper modelMapper=new ModelMapper();


	@Override
	public CompteComptableDTO convertToCompteComptableDTO(CompteComptable compteComptable) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		CompteComptableDTO compteComptableDTO=modelMapper.map(compteComptable, CompteComptableDTO.class);
		return compteComptableDTO;
	}
	@Override
	public CompteComptable convertToEmploye(CompteComptableDTO compteComptableDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		CompteComptable compteComptable=modelMapper.map(compteComptableDTO, CompteComptable.class);
		return compteComptable;
	}
}
