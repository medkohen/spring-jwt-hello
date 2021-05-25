package com.medkohen.springjwt.service;


import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("medkohen".equals(username)) {
			//https://www.javainuse.com/onlineBcrypt
			return new User("medkohen", "$2a$10$Jl9ZTj7AltYUdHq5BJMzL.1947dOdBKCQpWdSlOfV0fCuM054inEi",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
	

}
