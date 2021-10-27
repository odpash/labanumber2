package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int level) {
        super(name, level);
        init();
    }

    private void init() {
        setStats(40, 30, 35, 50, 70,55);
        setType(Type.GRASS, Type.POISON);  // https://pokemondb.net/pokedex/budew
        setMove(new Facade(), new Rest());
    }
}
