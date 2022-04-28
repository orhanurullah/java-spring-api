package com.springdemolar.m.ilkdemo.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemolar.m.ilkdemo.business.ICountryService;
import com.springdemolar.m.ilkdemo.entities.Country;

@RestController
@RequestMapping("/api")
public class CountryController {
	
	private ICountryService countryService;
	@Autowired
	public CountryController(ICountryService countryService) {
		super();
		this.countryService = countryService;
	}
	
	@GetMapping("/countries")
	public List<Country> getAll(){
		return this.countryService.getAll();
	}
	@PostMapping("/countries/add")
	public void add(@RequestBody Country country) {
		this.countryService.add(country);
	}
	@PostMapping("/countries/update")
	public void update(@RequestBody Country country) {
		this.countryService.update(country);
	}
	@PostMapping("/countries/delete")
	public void delete(@RequestBody Country country) {
		this.countryService.delete(country);
	}
	@GetMapping("/countries/{id}")
	public Country getById(@PathVariable int id) {
		return this.countryService.getById(id);
	}

}
