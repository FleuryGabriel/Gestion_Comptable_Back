package com.adaming.mapper;

import com.adaming.dto.ExerciceDTO;
import com.adaming.entities.Exercice;

public interface IExerciceMapper {
	ExerciceDTO convertToExerciceDTO(Exercice exercice);

	Exercice convertToExercice(ExerciceDTO exerciceDTO);
}
