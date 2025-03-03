package com.example.pokemon.controller;

import com.example.pokemon.model.PokemonModel;
import com.example.pokemon.repository.PokemonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon_bdd")
public class PokemonController {

    private final PokemonRepository repository;

    public PokemonController(PokemonRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PokemonModel> getAllPokemons() {
        return repository.findAll();
    }
}
