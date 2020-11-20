package com.adaming.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.stereotype.Component;

import com.adaming.dto.ExerciceDTO;
import com.adaming.entities.Exercice;

@Component
public class ExerciceMapper implements IExerciceMapper{
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public ExerciceDTO convertToExerciceDTO(Exercice exercice) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		ExerciceDTO exerciceDTO = modelMapper.map(exercice, ExerciceDTO.class);		
		return exerciceDTO;
	}

	@Override
	public Exercice convertToExercice(ExerciceDTO exerciceDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Exercice exercice = modelMapper.map(exerciceDTO, Exercice.class);
		return exercice;
	}
	

}
