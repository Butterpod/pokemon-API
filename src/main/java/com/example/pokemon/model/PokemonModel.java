package com.example.pokemon.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pokemon")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class PokemonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type1;
    private String type2;
    private String color;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
}