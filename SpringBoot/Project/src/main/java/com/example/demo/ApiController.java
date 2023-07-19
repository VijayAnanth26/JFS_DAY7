package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class ApiController {
	@Autowired
	ApiRepo Repo;
	@Autowired
	ApiService service;
	
	@GetMapping("/get")
	public List <Volunteer> getList(){
		return Repo.findAll();
	}
	@GetMapping("/{id}")
	public Volunteer getVolunteer(@PathVariable Long id) {
		return service.getVolunteerById(id);
	}
	@PostMapping("/post")
	public Volunteer create(@RequestBody Volunteer a) {
		return Repo.save(a);
	}
	@PutMapping("/update")
	public String update(@RequestBody Volunteer a){
		return service.updateDetails(a);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		return service.deletedetails(id);
	}
}
