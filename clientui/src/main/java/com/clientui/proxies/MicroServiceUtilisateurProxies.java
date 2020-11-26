package com.clientui.proxies;

import java.util.List;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.clientui.beans.AgenceBean;
import com.clientui.beans.EmployeBean;
import com.clientui.beans.RoleBean;
import com.clientui.beans.UtilisateurBean;

@FeignClient(name = "microservice-utilisateur")
@RibbonClient(name = "microservice-utilisateur")
public interface MicroServiceUtilisateurProxies {

	// Role
	@PostMapping(value = "/roles")
	public void addRole(@RequestBody RoleBean r);

	@GetMapping(value = "/roles")
	public List<RoleBean> getAllRole();

	@GetMapping(value = "/roles/{id}")
	public RoleBean findByIdRole(@PathVariable long id);

	@DeleteMapping(value = "/roles/{id}")
	public void deleteRole(@PathVariable long id);

	@PutMapping(value = "/roles/{id}")
	public void deletedRole(@PathVariable long id);

	// Utilisateur
	@PostMapping(value = "/utilisateurs")
	public void addUtilisateur(@RequestBody UtilisateurBean u);

	@GetMapping(value = "/utilisateurs")
	public List<UtilisateurBean> getAllUtilisateur();

	@GetMapping(value = "/utilisateurs/{id}")
	public UtilisateurBean findByIdUtilisateur(@PathVariable long id);

	@DeleteMapping(value = "/utilisateurs/{id}")
	public void deleteUtilisateur(@PathVariable long id);

	@PutMapping(value = "/utilisateurs/{id}")
	public void deletedUtilisateur(@PathVariable long id);
	
	@GetMapping(value="/utilisateursByLogin")
	public UtilisateurBean findUtilisateurByLogin(@RequestParam(name="login") String login);
	
	@GetMapping(value="/utilisateursAuthentification")
	public UtilisateurBean authentification(@RequestParam("login") String login,@RequestParam String password);
	
	@GetMapping(value="/utilisateursWithLogin")
	public List<UtilisateurBean> findUtilisateurWithLogin(@RequestParam(name="login") String login);
	
	@GetMapping(value="/utilisateursNotDeleted")
	public List<UtilisateurBean> findUtilisateurNotDeleted();

	// Employe
	@PostMapping(value = "/employees")
	public void addemployee(@RequestBody EmployeBean e);

	@GetMapping(value = "/employees")
	public List<EmployeBean> getAllEmploye();

	@GetMapping(value = "/employees/{id}")
	public EmployeBean findByIdEmploye(@PathVariable long id);

	@DeleteMapping(value = "/employees/{id}")
	public void deleteEmploye(@PathVariable long id);

	@PutMapping(value = "/employees/{id}")
	public void deletedEmploye(@PathVariable long id);
	
	@GetMapping(value="/employesNotDeleted")
	public List<EmployeBean> findEmployeNotDeleted();

	// Agence
	@PostMapping(value = "/agences")
	public void addagence(@RequestBody AgenceBean e);

	@GetMapping(value = "/agences")
	public List<AgenceBean> getAllAgence();

	@GetMapping(value = "/agences/{id}")
	public AgenceBean findByIdAgence(@PathVariable long id);

	@DeleteMapping(value = "/agences/{id}")
	public void deleteAgence(@PathVariable long id);

	@PutMapping(value = "/agences/{id}")
	public void deletedAgence(@PathVariable long id);
	
	@GetMapping(value = "/agencesNotDeleted")
	public List<AgenceBean> findAgenceNotDeleted();
}
