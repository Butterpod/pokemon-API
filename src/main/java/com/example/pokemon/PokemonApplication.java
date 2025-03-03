package com.example.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.pokemon.model.PokemonModel;
import com.example.pokemon.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;


@SpringBootApplication
public class PokemonApplication {
	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}

	@Bean
	CommandLineRunner run(PokemonRepository repository) {
		return args -> {
			List<PokemonModel> pokemons = repository.findAll();
			pokemons.forEach(System.out::println);
		};
	}
}