package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Journal;
import com.adaming.service.JournalService;

@RestController
public class JournalController {

	
	@Autowired
	JournalService journalService;
	
	@RequestMapping(value="journaux", method=RequestMethod.GET)
	public List<Journal> findAll() {
		return journalService.findAll();
	}
	@RequestMapping(value="journaux/{idJournal}", method=RequestMethod.GET)
	public Journal findOne(@PathVariable("idJournal") Long idJournal) {
		return journalService.findOne(idJournal);
	}
	@RequestMapping(value="journaux", method=RequestMethod.POST)
	public Journal saveJournal(@RequestBody Journal journal) {
		return journalService.save(journal);
	}
	@RequestMapping(value="journaux/{idJournal}", method=RequestMethod.DELETE)
	public void deleteJournal(@PathVariable("idJournal") Long idJournal) {
		journalService.delete(idJournal);
	}
	@RequestMapping(value="journaux/{idJournal}", method=RequestMethod.PUT)
	public Journal updateJournal(@PathVariable("idJournal") Long idJournal, @RequestBody Journal journal) {
		Journal currentJournal = journalService.findOne(idJournal);
		
		return journalService.save(currentJournal);
	}
	
	@RequestMapping(value="journaux/{idJournal}", method=RequestMethod.PUT)
	public Journal deletedJournal(@PathVariable("idJournal") Long idJournal, @RequestBody Journal journal) {
		
		Journal currentJournal = journalService.findOne(idJournal);
		currentJournal.setIsDeleted(true);
		
		return journalService.save(currentJournal);
	}
}
