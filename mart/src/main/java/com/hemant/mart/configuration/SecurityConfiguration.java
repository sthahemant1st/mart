package com.hemant.mart.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	/* This is Form java brains
	 * hardcoaded username and password
	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("user")
				.password("user")
				.roles("USER")
				.and()
				.withUser("admin")
				.password("password")
				.roles("ADMIN");
		
		auth.userDetailsService(userDetailsService);
	}
	@Bean
	public PasswordEncoder genPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	*/
	/*This is from Telusko 
	 * yo pani hardcoaded username and password...
	 
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		
		List<UserDetails> user = new ArrayList<UserDetails>();
		user.add(User.withDefaultPasswordEncoder().username("haha").password("haha").roles("USER").build());
		return new InMemoryUserDetailsManager(user);
	}
	*/
	
	/*
	 * BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
String result = encoder.encode("myPassword");
assertTrue(encoder.matches("myPassword", result));
	 */
	@Autowired
	UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder(10));		
		return provider;		
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeRequests()
//		.antMatchers("/admin").hasRole("ADMIN")
//		.antMatchers("/customer","/cart","/order").hasAnyRole("USER","ADMIN")
//		.antMatchers("/").permitAll()
//		.and().formLogin();
//	}
//	@SuppressWarnings("deprecation")
//	@Bean
//	public static NoOpPasswordEncoder passwordEncoder() {
//	return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//	}
	
	
	

}
