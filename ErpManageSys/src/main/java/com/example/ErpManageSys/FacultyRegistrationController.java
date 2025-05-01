package com.example.ErpManageSys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyRegistrationController {

	@Autowired
	FacultyRepository facultyRepository;
	
	@PostMapping("/register/faculty")
	public Faculty registerFaculty(@RequestBody Faculty faculty) {
		return facultyRepository.save(faculty);
	}
}
