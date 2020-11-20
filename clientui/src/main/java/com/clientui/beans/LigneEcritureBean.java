package com.clientui.beans;

import java.util.Date;

public class LigneEcritureBean {

	private Long id;
	private String libelle;
	private float debit;
	private float credit;
	private Date dateEcriture;
	private boolean deleted = false;
	
	public LigneEcritureBean() {
	}
	public LigneEcritureBean(String libelle, float debit, float credit, Date dateEcriture, boolean deleted) {
		super();
		this.libelle = libelle;
		this.debit = debit;
		this.credit = credit;
		this.dateEcriture = dateEcriture;
		this.deleted = deleted;
	}
	public LigneEcritureBean(Long id, String libelle, float debit, float credit, Date dateEcriture, boolean deleted) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.debit = debit;
		this.credit = credit;
		this.dateEcriture = dateEcriture;
		this.deleted = deleted;
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
	public boolean deleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
