package com.sgam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Autowired
	UserDetailsService userDetailsService;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(encodePassword());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
		http.authorizeRequests()
			.antMatchers("/admin/**").authenticated().anyRequest().permitAll()
			.and()
			.authorizeHttpRequests()
			.antMatchers("/funcionario/**").authenticated().anyRequest().permitAll()
			.and()
			.formLogin()
			.loginPage("/login")
				.defaultSuccessUrl("/auth/validar", true)
				.permitAll()
			.and()
			.logout().permitAll();
				
			
		
		
		/*
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
			.antMatchers("/funcionario/**").hasAnyAuthority("EDITOR")
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
				.defaultSuccessUrl("/admin/estabelecimentos/cadastrar")
			.permitAll()
			.and()
			.logout().permitAll();
		
		http.authorizeRequests()
		.anyRequest().authenticated()
		.and().formLogin().loginPage("/login")
			.permitAll()
		.and().logout();
		
		http.authorizeRequests()
            .antMatchers("/").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
            .antMatchers("/new").hasAnyAuthority("ADMIN", "CREATOR")
            .antMatchers("/edit/**").hasAnyAuthority("ADMIN", "EDITOR")
            .antMatchers("/delete/**").hasAuthority("ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin().permitAll()
            .and()
            .logout().permitAll()
            .and()
            .exceptionHandling().accessDeniedPage("/403")
            ;		*/
	}
	
	@Bean
	public BCryptPasswordEncoder encodePassword() {
		return new BCryptPasswordEncoder();
	}
}
