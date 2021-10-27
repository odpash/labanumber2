package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class CottonGuard extends SpecialMove {
    public CottonGuard() {
        super();
        type = Type.GRASS;
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE, +3);
    }

    @Override
    protected String describe() {
        return "использует Cotton Guard";
    }
}
