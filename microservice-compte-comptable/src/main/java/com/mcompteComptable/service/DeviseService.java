package com.mcompteComptable.service;

import java.util.List;
import com.mcompteComptable.entities.Devise;

public interface DeviseService {

	public Devise saveOrUpdate (Devise Devise);
	public void delete (Long id);
	public List<Devise> findAll();
	public Devise findOne(Long id);

}
