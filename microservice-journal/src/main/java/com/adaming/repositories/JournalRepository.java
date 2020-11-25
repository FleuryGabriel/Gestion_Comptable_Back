package com.adaming.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adaming.entities.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long>{
	
	public List<Journal> findByDeleted(boolean bool);

}
