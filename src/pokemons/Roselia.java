package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Pokemon {
    public Roselia(String name, int level) {
        super(name, level);
        init();
    }

    private void init() {
        setStats(50, 60, 45, 100, 80,65);
        setType(Type.GRASS, Type.POISON);  // https://pokemondb.net/pokedex/roselia
        setMove(new Facade(), new Rest(), new CottonGuard());
    }
}
