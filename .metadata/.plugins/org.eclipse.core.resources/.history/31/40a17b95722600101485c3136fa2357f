package com.example.ErpManageSys;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            // Try to parse the username as the user ID (integer)
            int id = Integer.parseInt(username); // Treat username as ID
            Optional<User> user = repository.findById(id);

            if (user.isPresent()) {
                var userObj = user.get();

                // Add ROLE_ prefix to the roles (assuming role is stored as 'student', 'faculty', etc.)
                String role = userObj.getRole(); // This should be 'student', 'faculty', etc.
                String roleName = "ROLE_" + role.toUpperCase(); // Prepend ROLE_ and convert to uppercase

                // Return UserDetails with the correct role format
                return org.springframework.security.core.userdetails.User.builder()
                        .username(String.valueOf(userObj.getId())) // Use the user ID as username
                        .password(userObj.getPassword())
                        .authorities(new SimpleGrantedAuthority(roleName)) // Use authorities instead of roles
                        .build();
            } else {
                throw new UsernameNotFoundException("User not found with ID: " + id);
            }
        } catch (NumberFormatException e) {
            throw new UsernameNotFoundException("Invalid ID format: " + username);
        }
    }
}
