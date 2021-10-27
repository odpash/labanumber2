package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FakeTears extends SpecialMove {
    public FakeTears() { super(Type.DARK, 0.0, 100); }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
      pokemon.setMod(Stat.SPECIAL_ATTACK, +2);
    }
    @Override
    protected String describe() {
        return "использует Fake Tears";
    }
}
