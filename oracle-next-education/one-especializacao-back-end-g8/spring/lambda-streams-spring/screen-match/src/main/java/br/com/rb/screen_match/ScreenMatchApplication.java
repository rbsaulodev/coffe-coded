package br.com.rb.screen_match;

import br.com.rb.screen_match.main.Menu;
import br.com.rb.screen_match.model.Episodes;
import br.com.rb.screen_match.model.Seasons;
import br.com.rb.screen_match.model.Series;
import br.com.rb.screen_match.services.ApiService;
import br.com.rb.screen_match.services.ConverteData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class 	ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Menu menu = new Menu();
		menu.menu();
	}
}
