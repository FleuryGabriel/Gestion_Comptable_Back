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
import com.clientui.beans.ExerciceBean;
import com.clientui.beans.JournalBean;
import com.clientui.beans.LigneEcritureBean;;

@FeignClient(name = "microservice-journal")
@RibbonClient(name = "microservice-journal")
public interface MicroServiceExerciceComptableProxies {

	// Exercice
	@PostMapping(value = "/exercices")
	public void addExercice(@RequestBody ExerciceBean c);

	@GetMapping(value = "/exercices")
	public List<ExerciceBean> getAllExercice();

	@GetMapping(value = "/exercices/{id}")
	public ExerciceBean findByIdExercice(@PathVariable long id);

	@DeleteMapping(value = "/exercices/{id}")
	public void deleteExercice(@PathVariable long id);

	@PutMapping(value = "/exercices/{id}")
	public void deletedExercice(@PathVariable long id);

	// LigneEcriture
	@PostMapping(value = "/ligneEcritures")
	public void addLigneEcriture(@RequestBody LigneEcritureBean l);

	@GetMapping(value = "/ligneEcritures")
	public List<LigneEcritureBean> getAllLigneEcriture();

	@GetMapping(value = "/ligneEcritures/{id}")
	public LigneEcritureBean findByIdLigneEcriture(@PathVariable long id);

	@DeleteMapping(value = "/ligneEcritures/{id}")
	public void deleteLigneEcriture(@PathVariable long id);

	@PutMapping(value = "/ligneEcritures/{id}")
	public void deletedLigneEcriture(@PathVariable long id);

	// Journaux
	@PostMapping(value = "/journauxs")
	public void addJournal(@RequestBody JournalBean j);

	@GetMapping(value = "/journauxs")
	public List<JournalBean> getAllJournal();

	@GetMapping(value = "/journauxs/{id}")
	public JournalBean findByIdJournal(@PathVariable long id);

	@DeleteMapping(value = "/journauxs/{id}")
	public void deleteJournal(@PathVariable long id);

	@PutMapping(value = "/journauxs/{id}")
	public void deletedJournal(@PathVariable long id);

}
