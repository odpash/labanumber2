package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Burmy extends Pokemon {
    public Burmy(String name, int level) {
        super(name, level);
        init();
    }

    private void init() {
        setStats(40, 29, 45, 29, 45,36);
        setType(Type.BUG);  // https://pokemondb.net/pokedex/burmy
        setMove(new Facade(), new Rest(), new SteelWing());
    }
}
