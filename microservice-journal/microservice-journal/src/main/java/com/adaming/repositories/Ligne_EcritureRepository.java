package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Ligne_Ecriture;

@Repository
public interface Ligne_EcritureRepository extends JpaRepository<Ligne_Ecriture, Long>{

}
