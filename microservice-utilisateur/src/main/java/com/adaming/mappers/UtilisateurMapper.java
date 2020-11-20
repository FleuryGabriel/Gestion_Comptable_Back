package com.adaming.mappers;

import com.adaming.dto.UtilisateurDTO;
import com.adaming.entities.Utilisateur;

public interface UtilisateurMapper {
	
	UtilisateurDTO convertToUtilisateurDTO(Utilisateur uIn);
	
	Utilisateur convertToUtilisateur(UtilisateurDTO uDTO);

}
