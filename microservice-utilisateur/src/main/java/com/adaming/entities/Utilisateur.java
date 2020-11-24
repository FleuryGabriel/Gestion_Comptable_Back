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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_UTILISATEUR")
	private Long id;
	@Column(name = "LOGIN_UTILISATEUR", unique=true, nullable=false)
	private String login;
	@Column(name = "PASSWORD_UTILISATEUR", nullable=false)
	private String password;
	@Column(name = "DATECREATION_UTILISATEUR")
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Column(name = "ENABLED_UTILISATEUR")
	private boolean enabled;
	
	private boolean deleted = false;
	
	@ManyToOne
	@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID_ROLE")
	private Role role;
	
	@OneToOne
	@JoinColumn(name = "EMPLOYE_ID", referencedColumnName = "ID_EMPLOYE")
	private Employe employe;

	public Utilisateur() {
	}

	public Utilisateur(String login, String password, Date dateCreation, boolean enabled) {
		this.login = login;
		this.password = password;
		this.dateCreation = dateCreation;
		this.enabled = enabled;
	}

	public Utilisateur(Long id, String login, String password, Date dateCreation, boolean enabled) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.dateCreation = dateCreation;
		this.enabled = enabled;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}
