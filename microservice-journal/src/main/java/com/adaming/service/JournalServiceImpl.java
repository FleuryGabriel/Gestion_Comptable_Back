package com.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Journal;
import com.adaming.repositories.JournalRepository;

@Service
public class JournalServiceImpl implements JournalService{
	@Autowired
	JournalRepository journalRepository;
	
	@Override
	public List<Journal> findAll() {
		return journalRepository.findAll();
	}

	@Override
	public Journal findOne(Long idJournal) {
		return journalRepository.getOne(idJournal);
	}

	@Override
	public Journal save(Journal journal) {
		return journalRepository.save(journal);
	}

	@Override
	public void delete(Long idJournal) {
		journalRepository.deleteById(idJournal);
		
	}

	@Override
	public List<Journal> findNotDeleted() {
		return journalRepository.findByDeleted(false);
	}
	
	

}
