package com.adaming.mapper;

import com.adaming.dto.Ligne_EcritureDTO;
import com.adaming.entities.Ligne_Ecriture;

public interface ILigne_EcritureMapper {
	Ligne_EcritureDTO convertToLigne_EcritureDTO(Ligne_Ecriture ligne_Ecriture);

	Ligne_Ecriture convertToLigne_Ecriture(Ligne_EcritureDTO ligne_EcritureDTO);

}
