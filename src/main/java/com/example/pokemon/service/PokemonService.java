package com.example.pokemon.service;

import com.example.pokemon.model.PokemonModel;
import com.example.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository repository;

    // Récupérer tous les pokemons
    public List<PokemonModel> getAllPokemons() {
        return repository.findAll();
    }

    // Récupérer un pokemon par son ID
    public Optional<PokemonModel> getPokemonById(Long id) {
        return repository.findById(id);
    }

    // Ajouter ou modifier un pokemon
    public PokemonModel savePokemon(PokemonModel pokemon) {
        return repository.save(pokemon);
    }

    // Supprimer un pokemon
    public void deletePokemon(Long id) {
        repository.deleteById(id);
    }
}
