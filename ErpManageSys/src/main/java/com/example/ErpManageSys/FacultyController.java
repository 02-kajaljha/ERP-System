package com.example.ErpManageSys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class FacultyController {

	@Autowired
	FacultyRepository facultyRepository;
	
	@GetMapping("/faculty/user")
	public String showFacultyDashboard(Model model) {
		
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		String userIdString=authentication.getName();
		Integer userId;
		
		try {
			userId=Integer.parseInt(userIdString);
		}catch(NumberFormatException e) {
			System.err.println("Error parsing user ID: " + e.getMessage());
            return "error"; 
		}
		
		Faculty faculty=facultyRepository.findById(userId).orElse(null);
		
		if(faculty==null) {
			return "error";
		}
		
		model.addAttribute("faculty",faculty);
		
		return "faculty";
	}
}
