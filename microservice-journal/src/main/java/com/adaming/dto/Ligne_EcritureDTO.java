package com.adaming.dto;

import java.util.Date;

import com.adaming.entities.Exercice;
import com.adaming.entities.Journal;

public class Ligne_EcritureDTO {
	
	private Long id;
	private String libelle;
	private float virement;
	private Date dateEcriture;
	
	private boolean deleted = false;

	private Exercice exercice;

	private Journal journal;

	public Ligne_EcritureDTO() {
	}

	public Ligne_EcritureDTO(String libelle, float virement, Date dateEcriture, boolean deleted,
			Exercice exercice, Journal journal) {
		this.libelle = libelle;
		this.virement = virement;
		this.dateEcriture = dateEcriture;
		this.deleted = deleted;
		this.exercice = exercice;
		this.journal = journal;
	}

	public Ligne_EcritureDTO(Long id, String libelle, float virement, Date dateEcriture, boolean deleted,
			Exercice exercice, Journal journal) {
		this.id = id;
		this.libelle = libelle;
		this.virement = virement;
		this.dateEcriture = dateEcriture;
		this.deleted = deleted;
		this.exercice = exercice;
		this.journal = journal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public float getVirement() {
		return virement;
	}

	public void setVirement(float virement) {
		this.virement = virement;
	}

	public Date getDateEcriture() {
		return dateEcriture;
	}

	public void setDateEcriture(Date dateEcriture) {
		this.dateEcriture = dateEcriture;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Exercice getExercice() {
		return exercice;
	}

	public void setExercice(Exercice exercice) {
		this.exercice = exercice;
	}

	public Journal getJournal() {
		return journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}

}
