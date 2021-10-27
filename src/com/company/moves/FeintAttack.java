package com.company.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends SpecialMove {
    public FeintAttack() { super(Type.DARK, 50, 90); }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ACCURACY, 100);
    }

    @Override
    protected String describe() {
        return "использует Feint Attack";
    }
}
