package com.adaming.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Agence;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long>{
	
	public List<Agence> findByDeleted(boolean bool);

}
