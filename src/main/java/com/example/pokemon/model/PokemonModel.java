package com.example.pokemon.model;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "pokemon")
public class PokemonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="type1")
    private String type1;

    @Column(name="type2")
    private String type2;

    @Column(name="color")
    private String color;

    @Column(name="hp")
    private int hp;

    @Column(name="attack")
    private int attack;

    @Column(name="defense")
    private int defense;

    @Column(name="speed")
    private int speed;
}