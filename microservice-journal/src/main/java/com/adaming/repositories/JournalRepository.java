package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adaming.entities.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long>{

}
