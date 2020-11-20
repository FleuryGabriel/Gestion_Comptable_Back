package com.adaming.mappers;

import com.adaming.dto.EmployeDTO;
import com.adaming.entities.Employe;

public interface EmployeMapper {
	
	EmployeDTO convertToEmployeDTO(Employe eIn);
	
	Employe convertToEmploye(EmployeDTO eDTO);

}
