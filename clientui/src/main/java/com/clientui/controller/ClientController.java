package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clientui.beans.AgenceBean;
import com.clientui.beans.CompteComptableBean;
import com.clientui.beans.DeviseBean;
import com.clientui.beans.EmployeBean;
import com.clientui.beans.ExerciceBean;
import com.clientui.beans.JournalBean;
import com.clientui.beans.LigneEcritureBean;
import com.clientui.beans.RoleBean;
import com.clientui.beans.UtilisateurBean;
import com.clientui.proxies.MicroServiceCompteComptableProxies;
import com.clientui.proxies.MicroServiceExerciceComptableProxies;
import com.clientui.proxies.MicroServiceUtilisateurProxies;

@RestController
@CrossOrigin
public class ClientController {

	@Autowired
	private MicroServiceUtilisateurProxies msup;

	@Autowired
	private MicroServiceExerciceComptableProxies msecp;

	@Autowired
	private MicroServiceCompteComptableProxies msccp;

	// Role
	@PostMapping(value = "/roles")
	public void addRole(@RequestBody RoleBean r) {
		msup.addRole(r);
	}

	@GetMapping(value = "/roles")
	public List<RoleBean> getAllRole() {
		return msup.getAllRole();
	}

	@GetMapping(value = "/roles/{id}")
	public RoleBean findByIdRole(@PathVariable long id) {
		return msup.findByIdRole(id);
	}

	@DeleteMapping(value = "/roles/{id}")
	public void deleteRole(@PathVariable long id) {
		msup.deleteRole(id);
	}

	@PutMapping(value = "/roles/{id}")
	public void deletedRole(@PathVariable long id) {
		msup.deletedRole(id);
	}

	// Utilisateur
	@PostMapping(value = "/utilisateurs")
	public void addUtilisateur(@RequestBody UtilisateurBean r) {
		msup.addUtilisateur(r);
	}

	@GetMapping(value = "/utilisateurs")
	public List<UtilisateurBean> getAllUtilisateur() {
		return msup.getAllUtilisateur();
	}

	@GetMapping(value = "/utilisateurs/{id}")
	public UtilisateurBean findByIdUtilisateur(@PathVariable long id) {
		return msup.findByIdUtilisateur(id);
	}

	@DeleteMapping(value = "/utilisateurs/{id}")
	public void deleteUtilisateur(@PathVariable long id) {
		msup.deleteUtilisateur(id);
	}

	@PutMapping(value = "/utilisateurs/{id}")
	public void deletedUtilisateur(@PathVariable long id) {
		msup.deletedUtilisateur(id);
	}

	@GetMapping(value = "/utilisateursByLogin")
	public UtilisateurBean findUtilisateurByLogin(@RequestParam(name = "login") String login) {
		return msup.findUtilisateurByLogin(login);
	}

	@GetMapping(value = "/utilisateursAuthentification")
	public UtilisateurBean authentification(@RequestParam("login") String login, @RequestParam String password) {
		return msup.authentification(login, password);
	}
	
	@GetMapping(value="/utilisateursWithLogin")
	public List<UtilisateurBean> findUtilisateurWithLogin(@RequestParam(name="login") String login){
		return msup.findUtilisateurWithLogin(login);
	}
	
	@GetMapping(value="/utilisateursNotDeleted")
	public List<UtilisateurBean> findNotDeleted(){
		return msup.findUtilisateurNotDeleted();
	}

	// Agence
	@PostMapping(value = "/agences")
	public void addAgence(@RequestBody AgenceBean r) {
		msup.addagence(r);
	}

	@GetMapping(value = "/agences")
	public List<AgenceBean> getAllAgence() {
		return msup.getAllAgence();
	}

	@GetMapping(value = "/agences/{id}")
	public AgenceBean findByIdAgence(@PathVariable long id) {
		return msup.findByIdAgence(id);
	}

	@DeleteMapping(value = "/agences/{id}")
	public void deleteAgence(@PathVariable long id) {
		msup.deleteAgence(id);
	}

	@PutMapping(value = "/agences/{id}")
	public void deletedAgence(@PathVariable long id) {
		msup.deletedAgence(id);
	}
	
	@GetMapping(value = "/agencesNotDeleted")
	public List<AgenceBean> findAgenceNotDeleted(){
		return msup.findAgenceNotDeleted();
	}

	// Employe
	@PostMapping(value = "/employes")
	public void addEmploye(@RequestBody EmployeBean r) {
		msup.addemployee(r);
	}

	@GetMapping(value = "/employes")
	public List<EmployeBean> getAllEmploye() {
		return msup.getAllEmploye();
	}

	@GetMapping(value = "/employes/{id}")
	public EmployeBean findByIdEmploye(@PathVariable long id) {
		return msup.findByIdEmploye(id);
	}

	@DeleteMapping(value = "/employes/{id}")
	public void deleteEmploye(@PathVariable long id) {
		msup.deleteEmploye(id);
	}
	
	@GetMapping(value="/employesNotDeleted")
	public List<EmployeBean> findEmployeNotDeleted(){
		return msup.findEmployeNotDeleted();
	}

	// Exercice
	@PostMapping(value = "/exercices")
	public void addExercice(@RequestBody ExerciceBean c) {
		msecp.addExercice(c);
	}

	@GetMapping(value = "/exercices")
	public List<ExerciceBean> getAllExercice() {
		return msecp.getAllExercice();
	}

	@GetMapping(value = "/exercices/{id}")
	public ExerciceBean findByIdExercice(@PathVariable long id) {
		return msecp.findByIdExercice(id);
	}

	@DeleteMapping(value = "/exercices/{id}")
	public void deleteExercice(@PathVariable long id) {
		msecp.deleteExercice(id);
	}

	@PutMapping(value = "/exercices/{id}")
	public void deletedExercice(@PathVariable long id) {
		msecp.deletedExercice(id);
	}
	
	@GetMapping(value = "/exercicesNotDeleted")
	public List<ExerciceBean> findExerciceNotDeleted(){
		return msecp.findExerciceNotDeleted();
	}

	// Journals
	@PostMapping(value = "/journaux")
	public void addJournals(@RequestBody JournalBean c) {
		msecp.addJournal(c);
	}

	@GetMapping(value = "/journaux")
	public List<JournalBean> getAllJournals() {
		return msecp.getAllJournal();
	}

	@GetMapping(value = "/journaux/{id}")
	public JournalBean findByIdJournals(@PathVariable long id) {
		return msecp.findByIdJournal(id);
	}

	@DeleteMapping(value = "/journaux/{id}")
	public void deleteJournals(@PathVariable long id) {
		msecp.deleteJournal(id);
	}

	@PutMapping(value = "/journaux/{id}")
	public void deletedJournals(@PathVariable long id) {
		msecp.deletedJournal(id);
	}
	
	@GetMapping(value = "/journauxNotDeleted")
	public List<JournalBean> findJournauxNotDeleted(){
		return msecp.findJournauxNotDeleted();
	}

	// LigneEcriture
	@PostMapping(value = "/ligneEcritures")
	public void addLigneEcriture(@RequestBody LigneEcritureBean j) {
		msecp.addLigneEcriture(j);
	}

	@GetMapping(value = "/ligneEcritures")
	public List<LigneEcritureBean> getAllLigneEcriture() {
		return msecp.getAllLigneEcriture();
	}

	@GetMapping(value = "/ligneEcritures/{id}")
	public LigneEcritureBean findByIdLigneEcriture(@PathVariable long id) {
		return msecp.findByIdLigneEcriture(id);
	}

	@DeleteMapping(value = "/ligneEcritures/{id}")
	public void deleteLigneEcriture(@PathVariable long id) {
		msecp.deleteExercice(id);
	}

	@PutMapping(value = "/ligneEcritures/{id}")
	public void deletedLigneEcriture(@PathVariable long id) {
		msecp.deletedExercice(id);
	}

	// CompteComptable
	@PostMapping(value = "/compteComptables")
	public void addCompteComptable(@RequestBody CompteComptableBean r) {
		msccp.addCompteComptable(r);
	}

	@GetMapping(value = "/compteComptables")
	public List<CompteComptableBean> getAllCompteComptable() {
		return msccp.getAllCompteComptable();
	}

	@GetMapping(value = "/compteComptables/{id}")
	public CompteComptableBean findByIdCompteComptable(@PathVariable long id) {
		return msccp.findByIdCompteComptable(id);
	}

	@DeleteMapping(value = "/compteComptables/{id}")
	public void deleteCompteComptable(@PathVariable long id) {
		msccp.deleteCompteComptable(id);
	}

	@PutMapping(value = "/compteComptables/{id}")
	public void deletedCompteComptable(@PathVariable long id) {
		msccp.deletedCompteComptable(id);
	}

	// Devise
	@PostMapping(value = "/devises")
	public void addDevise(@RequestBody DeviseBean r) {
		msccp.addDevise(r);
	}

	@GetMapping(value = "/devises")
	public List<DeviseBean> getAllDevise() {
		return msccp.getAllDevise();
	}

	@GetMapping(value = "/devises/{id}")
	public DeviseBean findByIdDevise(@PathVariable long id) {
		return msccp.findByIdDevise(id);
	}

	@DeleteMapping(value = "/devises/{id}")
	public void deleteDevise(@PathVariable long id) {
		msccp.deleteDevise(id);
	}

	@PutMapping(value = "/devises/{id}")
	public void deletedDevise(@PathVariable long id) {
		msccp.deletedDevise(id);
	}
}
