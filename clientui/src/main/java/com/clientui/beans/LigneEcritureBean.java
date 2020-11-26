package com.clientui.beans;

import java.util.Date;



public class LigneEcritureBean {

	private Long id;
	private String libelle;
	private float virement;
	private Date dateEcriture;
	private boolean deleted = false;
	private ExerciceBean exercice;
	private JournalBean journal;
	
	
	public LigneEcritureBean() {
	}

	public LigneEcritureBean(Long id, String libelle, float virement, Date dateEcriture, boolean deleted,
			ExerciceBean exercice, JournalBean journal) {
	
		this.id = id;
		this.libelle = libelle;
		this.virement = virement;
		this.dateEcriture = dateEcriture;
		this.deleted = deleted;
		this.exercice = exercice;
		this.journal = journal;
	}

	public LigneEcritureBean(String libelle, float virement, Date dateEcriture, boolean deleted, ExerciceBean exercice,
			JournalBean journal) {
	
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

	public Date getDateEcriture() {
		return dateEcriture;
	}
	public void setDateEcriture(Date dateEcriture) {
		this.dateEcriture = dateEcriture;
	}
	public boolean deleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public float getVirement() {
		return virement;
	}
	public void setVirement(float virement) {
		this.virement = virement;
	}

	public ExerciceBean getExercice() {
		return exercice;
	}

	public void setExercice(ExerciceBean exercice) {
		this.exercice = exercice;
	}

	public JournalBean getJournal() {
		return journal;
	}

	public void setJournal(JournalBean journal) {
		this.journal = journal;
	}

	public boolean isDeleted() {
		return deleted;
	}
	
}
