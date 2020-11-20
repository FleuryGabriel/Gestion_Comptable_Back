package com.adaming.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.dto.JournalDTO;
import com.adaming.entities.Journal;
import com.adaming.mapper.IJournalMapper;
import com.adaming.service.JournalService;

@RestController
@CrossOrigin
public class JournalController {

	
	@Autowired
	JournalService journalService;
	@Autowired
	IJournalMapper journalMapper;
	
	@GetMapping(value="/journaux")
	public List<JournalDTO> findAll() {
		return (List<JournalDTO>) journalService.findAll().stream().map(e -> journalMapper.convertToJournalDTO(e))
				.collect(Collectors.toList());
	}
	@GetMapping(value="/journaux/{idJournal}")
	public JournalDTO findOne(@PathVariable("idJournal") Long idJournal) {
		return journalMapper.convertToJournalDTO(journalService.findOne(idJournal));
	}
	@PostMapping(value="/journaux")
	public JournalDTO saveJournal(@RequestBody Journal journal) {
		return journalMapper.convertToJournalDTO(journalService.save(journal));
	}
	@DeleteMapping(value="/journaux/{idJournal}")
	public void deleteJournal(@PathVariable("idJournal") Long idJournal) {
		journalService.delete(idJournal);
	}
	
	@PutMapping(value="/journaux/{idJournal}")
	public JournalDTO deletedJournal(@PathVariable("idJournal") Long idJournal) {
		
		Journal currentJournal = journalService.findOne(idJournal);
		currentJournal.setDeleted(true);
		
		return journalMapper.convertToJournalDTO(journalService.save(currentJournal));
	}
}
