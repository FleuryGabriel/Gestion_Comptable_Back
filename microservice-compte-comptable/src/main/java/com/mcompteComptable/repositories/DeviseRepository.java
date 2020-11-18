package com.mcompteComptable.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcompteComptable.entities.Devise;

@Repository
public interface DeviseRepository extends JpaRepository<Devise, Long> {

}
