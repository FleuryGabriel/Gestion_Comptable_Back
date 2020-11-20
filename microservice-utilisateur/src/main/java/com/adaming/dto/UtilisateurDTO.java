package com.adaming.dto;

import java.util.Date;

import com.adaming.entities.Employe;
import com.adaming.entities.Role;

public class UtilisateurDTO {
	
	private Long id;
	private String login;
	private String password;
	private Date dateCreation;
	private boolean enabled;
	private boolean deleted = false;

	private Role role;
	private Employe employe;

	public UtilisateurDTO() {
	}

	public UtilisateurDTO(String login, String password, Date dateCreation, boolean enabled) {
		this.login = login;
		this.password = password;
		this.dateCreation = dateCreation;
		this.enabled = enabled;
	}

	public UtilisateurDTO(Long id, String login, String password, Date dateCreation, boolean enabled) {
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
