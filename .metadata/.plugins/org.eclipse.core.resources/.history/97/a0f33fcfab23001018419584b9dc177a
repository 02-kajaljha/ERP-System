package com.example.ErpManageSys;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws ServletException, IOException {

        // Check if the user has the role "STUDENT"
        boolean isStudent = authentication.getAuthorities().stream()
                .anyMatch(granted -> granted.getAuthority().equalsIgnoreCase("ROLE_STUDENT"));

        // Check if the user has the role "FACULTY"
        boolean isFaculty = authentication.getAuthorities().stream()
                .anyMatch(granted -> granted.getAuthority().equalsIgnoreCase("ROLE_FACULTY"));

        // Redirect based on role
        if (isStudent) {
            setDefaultTargetUrl("/student/user");
        } else if (isFaculty) {
            setDefaultTargetUrl("/faculty/user");
        } else {
            setDefaultTargetUrl("/error"); // Redirect to a default page if neither role is present
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
