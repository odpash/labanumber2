package pokemons;

import moves.ChargeBeam;
import moves.Growl;
import moves.FeintAttack;
import moves.FakeTears;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Arceus extends Pokemon {
    public Arceus(String name, int level) {
        super(name, level);
        init();
    }

    private void init() {
        setStats(120, 120, 120, 120, 120,120);
        setType(Type.NORMAL);  // https://pokemondb.net/pokedex/arceus
        setMove(new ChargeBeam(), new Growl(), new FeintAttack(), new FakeTears());
    }
}
