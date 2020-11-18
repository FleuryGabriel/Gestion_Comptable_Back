package com.adaming.service;

import java.util.List;

import com.adaming.entities.Journal;

public interface JournalService {
	List<Journal> findAll();
	
	Journal findOne(Long idJournal);
	
	Journal save(Journal journal);

	void delete(Long idJournal);

}
