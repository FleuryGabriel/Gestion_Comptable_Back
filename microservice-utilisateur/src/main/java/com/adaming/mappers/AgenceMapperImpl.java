package com.adaming.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.adaming.dto.AgenceDTO;
import com.adaming.entities.Agence;
@Component
public class AgenceMapperImpl implements AgenceMapper{
	
	ModelMapper modelMapper = new ModelMapper();
	

	@Override
	public AgenceDTO convertToAgenceDTO(Agence aIn) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		AgenceDTO aDTO = modelMapper.map(aIn, AgenceDTO.class);
		return aDTO;
	}

	@Override
	public Agence convertToAgence(AgenceDTO aDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Agence aIn = modelMapper.map(aDTO, Agence.class);
		return aIn;
	}

}
