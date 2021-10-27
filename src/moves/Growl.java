package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Growl extends SpecialMove {
    public Growl() { super(Type.NORMAL, 0.0, 100); }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, +1);
    }

    @Override
    protected String describe() {
        return "использует Growl";
    }
}
