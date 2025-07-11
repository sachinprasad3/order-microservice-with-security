package com.user.service.security;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.user.service.entity.MyUser;
import com.user.service.repo.MyUserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private MyUserRepo myUserRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MyUser user = myUserRepo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User not found with username: " + username));


		        // Convert List<Roles> to GrantedAuthority list
		        List<SimpleGrantedAuthority> authorities = user.getRoles().stream()
		            .map(role -> new SimpleGrantedAuthority(role.getRole())) // e.g., ROLE_USER, ROLE_ADMIN
		            .toList(); // Requires Java 16+ or replace with `.collect(Collectors.toList())` for earlier versions

		        return new org.springframework.security.core.userdetails.User(
		            user.getUsername(),
		            user.getPassword(),
		            authorities
		        );
	}

}
