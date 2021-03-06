package com.adaming.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Exercice;

@Repository
public interface ExerciceRepository extends JpaRepository<Exercice, Long>{
	
	public List<Exercice> findByDeleted(boolean bool);

}
