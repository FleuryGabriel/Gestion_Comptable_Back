package com.adaming.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.adaming.dto.UtilisateurDTO;
import com.adaming.entities.Utilisateur;
@Component
public class UtilisateurMapperImpl implements UtilisateurMapper{

ModelMapper modelMapper = new ModelMapper();
	

	@Override
	public UtilisateurDTO convertToUtilisateurDTO(Utilisateur uIn) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		UtilisateurDTO uDTO = modelMapper.map(uIn, UtilisateurDTO.class);
		return uDTO;
	}

	@Override
	public Utilisateur convertToUtilisateur(UtilisateurDTO uDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Utilisateur uIn = modelMapper.map(uDTO, Utilisateur.class);
		return uIn;
	}

	
}
