package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Pokemon {
    public Roserade(String name, int level) {
        super(name, level);
        init();
    }

    private void init() {
        setStats(60, 70, 65, 125, 105,90);
        setType(Type.GRASS, Type.POISON);  // https://pokemondb.net/pokedex/roserade
        setMove(new Facade(), new Rest(), new CottonGuard(), new DoubleTeam());
    }
}
