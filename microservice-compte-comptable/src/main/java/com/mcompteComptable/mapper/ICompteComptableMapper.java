package com.mcompteComptable.mapper;

import com.mcompteComptable.DTO.CompteComptableDTO;
import com.mcompteComptable.entities.CompteComptable;

public interface ICompteComptableMapper {
	CompteComptableDTO convertToCompteComptableDTO(CompteComptable compteComptable);
	CompteComptable convertToEmploye(CompteComptableDTO CompteComptableDTO);
}
