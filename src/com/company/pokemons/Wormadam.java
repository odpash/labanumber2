package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wormadam extends Pokemon {
    public Wormadam(String name, int level) {
        super(name, level);
        init();
    }

    private void init() {
        setStats(60, 59, 85, 79, 105,36);
        setType(Type.BUG, Type.GRASS);  // https://pokemondb.net/pokedex/wormadam
        setMove(new Facade(), new Rest(), new SteelWing(), new FeintAttack());
    }
}
