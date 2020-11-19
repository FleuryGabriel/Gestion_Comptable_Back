package com.adaming.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "LIGNE_ECRITURE")
@Entity
public class Ligne_Ecriture  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LIGNE_ECRITURE")
	private Long id;
	@Column(name = "LIBELLE_LIGNE_ECRITURE")
	private String libelle;
	@Column(name = "DEBIT_LIGNE_ECRITURE")
	private float debit;
	@Column(name = "CREDIT_LIGNE_ECRITURE")
	private float credit;
	@Column(name = "DATEECRITURE_LIGNE_ECRITURE")
	private Date dateEcriture;
	
	private boolean isDeleted = false;
	
	@ManyToOne
	@JoinColumn(name = "EXERCICE_FK", referencedColumnName = "ID_EXERCICE")
	private Exercice exercice;
	
	@ManyToOne
	@JoinColumn(name = "JOURNAL_FK", referencedColumnName = "ID_JOURNAL")
	private Journal journal;

	public Ligne_Ecriture() {
	}

	public Ligne_Ecriture(String libelle, float debit, float credit, Date dateEcriture, boolean isDeleted,
			Exercice exercice, Journal journal) {
		this.libelle = libelle;
		this.debit = debit;
		this.credit = credit;
		this.dateEcriture = dateEcriture;
		this.isDeleted = isDeleted;
		this.exercice = exercice;
		this.journal = journal;
	}

	public Ligne_Ecriture(Long id, String libelle, float debit, float credit, Date dateEcriture, boolean isDeleted,
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
