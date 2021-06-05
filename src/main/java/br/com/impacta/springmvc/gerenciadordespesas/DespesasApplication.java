package br.com.impacta.springmvc.gerenciadordespesas;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class DespesasApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DespesasApplication.class, args);
	}
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(DespesasApplication.class);
	}

	public SpringApplicationBuilder conffigure(SpringApplicationBuilder app) {
		return app.sources(DespesasApplication.class);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}

}
