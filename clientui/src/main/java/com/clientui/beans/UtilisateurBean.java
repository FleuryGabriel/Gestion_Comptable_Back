package com.clientui.beans;

import java.util.Date;

public class UtilisateurBean {

	private Long id;
	private String login;
	private String password;
	private Date dateCreation;
	private boolean enabled;	
	private boolean deleted = false;
	private RoleBean role;
	private EmployeBean employe;
	
	public UtilisateurBean() {
	}
	public UtilisateurBean(String login, String password, Date dateCreation, boolean enabled, boolean deleted,
			RoleBean role, EmployeBean employe) {
		super();
		this.login = login;
		this.password = password;
		this.dateCreation = dateCreation;
		this.enabled = enabled;
		this.deleted = deleted;
		this.role = role;
		this.employe = employe;
	}
	public UtilisateurBean(Long id, String login, String password, Date dateCreation, boolean enabled, boolean deleted,
			RoleBean role, EmployeBean employe) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.dateCreation = dateCreation;
		this.enabled = enabled;
		this.deleted = deleted;
		this.role = role;
		this.employe = employe;
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
	public RoleBean getRole() {
		return role;
	}
	public void setRole(RoleBean role) {
		this.role = role;
	}
	public EmployeBean getEmploye() {
		return employe;
	}
	public void setEmploye(EmployeBean employe) {
		this.employe = employe;
	}
}
