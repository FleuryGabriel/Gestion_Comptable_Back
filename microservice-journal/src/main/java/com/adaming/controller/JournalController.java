package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Journal;
import com.adaming.service.JournalService;

@RestController
@CrossOrigin
public class JournalController {

	
	@Autowired
	JournalService journalService;
	
	@GetMapping(value="/journaux")
	public List<Journal> findAll() {
		return journalService.findAll();
	}
	@GetMapping(value="/journaux/{idJournal}")
	public Journal findOne(@PathVariable("idJournal") Long idJournal) {
		return journalService.findOne(idJournal);
	}
	@PostMapping(value="/journaux")
	public Journal saveJournal(@RequestBody Journal journal) {
		return journalService.save(journal);
	}
	@DeleteMapping(value="/journaux/{idJournal}")
	public void deleteJournal(@PathVariable("idJournal") Long idJournal) {
		journalService.delete(idJournal);
	}
	
	@PutMapping(value="/journaux/{idJournal}")
	public Journal deletedJournal(@PathVariable("idJournal") Long idJournal, @RequestBody Journal journal) {
		
		Journal currentJournal = journalService.findOne(idJournal);
		currentJournal.setIsDeleted(true);
		
		return journalService.save(currentJournal);
	}
}
