package com.adaming.mapper;

import com.adaming.dto.JournalDTO;
import com.adaming.entities.Journal;

public interface IJournalMapper {
	
	JournalDTO convertToJournalDTO(Journal journal);

	Journal convertToJournal(JournalDTO journalDTO);

}
