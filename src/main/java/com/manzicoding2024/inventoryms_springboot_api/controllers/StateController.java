package com.manzicoding2024.inventoryms_springboot_api.controllers;

//mport com.kindson.inventoryappspringbootapi.models.Country;
//import com.kindson.inventoryappspringbootapi.models.State;
//import com.kindson.inventoryappspringbootapi.services.CountryService;
//import com.kindson.inventoryappspringbootapi.services.StateService;
import com.manzicoding2024.inventoryms_springboot_api.models.State;
import com.manzicoding2024.inventoryms_springboot_api.services.CountryService;
import com.manzicoding2024.inventoryms_springboot_api.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StateController {
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;

	@GetMapping("/states")
	public List<State> addModelAttribute(){
		return stateService.findAll();
	}

	@GetMapping("/state/{id}")
	public State findOne(@PathVariable("id") Integer id){
		return stateService.findById(id);
	}

	@PutMapping("/state/{id}")
	public State editState(@RequestBody State state){
		return stateService.save(state);
	}

	//Add State
	@PostMapping(value="/states")
	public State addNew(@RequestBody State state) {
		return stateService.save(state);
	}

	@RequestMapping(value="/parameters/states/delete/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(@PathVariable Integer id) {
		stateService.delete(id);
		return "redirect:/parameters/states";
	}

}
