package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
	@Autowired
	ApiRepo Repo;
	public Volunteer getVolunteerById(Long id){
		return Repo.findById(id).get();
	}
	public String updateDetails(Volunteer a) {
		Repo.save(a);
		return "Updated";
	}
	public String deletedetails(Long id) {
		Repo.deleteById(id);;
		return "Deleted";
	}
}
