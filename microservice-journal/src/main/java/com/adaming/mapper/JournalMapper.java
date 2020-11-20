package com.adaming.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.adaming.dto.JournalDTO;
import com.adaming.entities.Journal;

@Component
public class JournalMapper implements IJournalMapper{
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public JournalDTO convertToJournalDTO(Journal journal) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		JournalDTO journalDTO = modelMapper.map(journal, JournalDTO.class);
		return journalDTO;
	}

	@Override
	public Journal convertToJournal(JournalDTO journalDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Journal journal = modelMapper.map(journalDTO, Journal.class);
		return journal;
	}

}
