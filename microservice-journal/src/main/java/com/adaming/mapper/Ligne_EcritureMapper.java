package com.adaming.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.adaming.dto.Ligne_EcritureDTO;
import com.adaming.entities.Ligne_Ecriture;

@Component
public class Ligne_EcritureMapper implements ILigne_EcritureMapper{
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public Ligne_EcritureDTO convertToLigne_EcritureDTO(Ligne_Ecriture ligne_Ecriture) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Ligne_EcritureDTO ligne_ecritureDTO = modelMapper.map(ligne_Ecriture, Ligne_EcritureDTO.class);
		return ligne_ecritureDTO;
	}

	@Override
	public Ligne_Ecriture convertToLigne_Ecriture(Ligne_EcritureDTO ligne_EcritureDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Ligne_Ecriture ligne_ecriture = modelMapper.map(ligne_EcritureDTO, Ligne_Ecriture.class);
		return ligne_ecriture;
	}

}
