package br.com.impacta.springmvc.gerenciadordespesas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class DespesaSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/login").permitAll()
			.antMatchers("/despesa/form").hasRole("MASTER")
			.antMatchers("/despesa/**").hasAnyRole("MASTER", "CONVIDADO")
			.and()
			.formLogin() // Form de login fornecido pelo Spring
			.and()
			.logout()
			.logoutSuccessUrl("/despesa");

	}

	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder.inMemoryAuthentication()
			   .withUser("joao").password(passwordEncoder.encode("joao123")).roles("MASTER")
			   .and()
			   .withUser("maria").password(passwordEncoder.encode("maria123")).roles("MASTER")
			   .and()
			   .withUser("jose").password(passwordEncoder.encode("jose123")).roles("CONVIDADO");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
