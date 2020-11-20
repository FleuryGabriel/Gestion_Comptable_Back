package com.adaming.mappers;

import com.adaming.dto.AgenceDTO;
import com.adaming.entities.Agence;

public interface AgenceMapper {
	
	AgenceDTO convertToAgenceDTO(Agence aIn);
	
	Agence convertToAgence(AgenceDTO aDTO);

}
