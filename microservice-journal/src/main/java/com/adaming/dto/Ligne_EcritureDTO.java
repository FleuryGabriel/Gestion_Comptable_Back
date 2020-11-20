package com.adaming.dto;

import java.util.Date;

import com.adaming.entities.Exercice;
import com.adaming.entities.Journal;

public class Ligne_EcritureDTO {
	
	private Long id;
	private String libelle;
	private float debit;
	private float credit;
	private Date dateEcriture;
	
	private boolean isDeleted = false;

	private Exercice exercice;

	private Journal journal;

	public Ligne_EcritureDTO() {
	}

	public Ligne_EcritureDTO(String libelle, float debit, float credit, Date dateEcriture, boolean isDeleted,
			Exercice exercice, Journal journal) {
		this.libelle = libelle;
		this.debit = debit;
		this.credit = credit;
		this.dateEcriture = dateEcriture;
		this.isDeleted = isDeleted;
		this.exercice = exercice;
		this.journal = journal;
	}

	public Ligne_EcritureDTO(Long id, String libelle, float debit, float credit, Date dateEcriture, boolean isDeleted,
			Exercice exercice, Journal journal) {
		this.id = id;
		this.libelle = libelle;
		this.debit = debit;
		this.credit = credit;
		this.dateEcriture = dateEcriture;
		this.isDeleted = isDeleted;
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

	public float getDebit() {
		return debit;
	}

	public void setDebit(float debit) {
		this.debit = debit;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public Date getDateEcriture() {
		return dateEcriture;
	}

	public void setDateEcriture(Date dateEcriture) {
		this.dateEcriture = dateEcriture;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
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
