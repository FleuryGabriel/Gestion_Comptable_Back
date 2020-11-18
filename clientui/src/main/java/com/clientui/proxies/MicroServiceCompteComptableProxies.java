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
import com.clientui.beans.CompteComptableBean;
import com.clientui.beans.DeviseBean;

@FeignClient(name = "microservice-compte-comptable")
@RibbonClient(name = "microservice-compte-comptable")
public interface MicroServiceCompteComptableProxies {

	// CompteComptable
	@PostMapping(value = "/compteComptables")
	public void addCompteComptable(@RequestBody CompteComptableBean c);

	@GetMapping(value = "/compteComptables")
	public List<CompteComptableBean> getAllCompteComptable();

	@GetMapping(value = "/compteComptables/{id}")
	public CompteComptableBean findByIdCompteComptable(@PathVariable long id);

	@DeleteMapping(value = "/compteComptables/{id}")
	public void deleteCompteComptable(@PathVariable long id);

	@PutMapping(value = "/compteComptables/{id}")
	public void deletedCompteComptable(@PathVariable long id);

	// Devise
	@PostMapping(value = "/devises")
	public void addDevise(@RequestBody DeviseBean d);

	@GetMapping(value = "/devises")
	public List<DeviseBean> getAllDevise();

	@GetMapping(value = "/devises/{id}")
	public DeviseBean findByIdDevise(@PathVariable long id);

	@DeleteMapping(value = "/devises/{id}")
	public void deleteDevise(@PathVariable long id);

	@PutMapping(value = "/devises/{id}")
	public void deletedDevise(@PathVariable long id);

}
