package com.mcompteComptable.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcompteComptable.entities.CompteComptable;

@Repository
public interface CompteComptableRepository extends JpaRepository<CompteComptable, Long> {

}
