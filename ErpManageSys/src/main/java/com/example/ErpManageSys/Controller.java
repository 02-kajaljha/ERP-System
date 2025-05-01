package com.example.ErpManageSys;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/login")
    public String login() {
        return "custom_login"; 
    }
    
//    @GetMapping("/student/user")
//    public String handleStudent() {
//    	return "student";
//    }
    
//    @GetMapping("/faculty/user")
//    public String handleFaculty() {
//    	return "faculty";
//    }
}
