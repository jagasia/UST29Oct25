package com.ust.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.MyUser;
import com.ust.demo.repositry.MyUserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	private Map<String, UserDetails> userMap=new TreeMap<>();	
	
	private PasswordEncoder encoder;
	@Autowired
	private MyUserRepository repo;
	
	
	
		
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<MyUser> op = repo.findById(username);
		if(op.isEmpty())
			throw new UsernameNotFoundException("Login failed");
		MyUser myUser = op.get();
		String str = myUser.getauthorities();
		String[] arr = str.split(",");
		List<GrantedAuthority> authorities=new ArrayList<>();
		for(String x:arr) {
			SimpleGrantedAuthority authority=new SimpleGrantedAuthority(x);
			authorities.add(authority);
		}
		User user=new User(myUser.getUsername(), myUser.getPassword(), authorities);
		return user;
	}

	
}
