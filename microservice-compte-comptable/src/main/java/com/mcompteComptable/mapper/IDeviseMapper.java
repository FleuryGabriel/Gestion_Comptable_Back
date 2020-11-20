package com.mcompteComptable.mapper;

import com.mcompteComptable.DTO.DeviseDTO;
import com.mcompteComptable.entities.Devise;

public interface IDeviseMapper {
	DeviseDTO convertToCompteComptableDTO(Devise devise);
	Devise convertToEmploye(DeviseDTO deviseDTO);
}
