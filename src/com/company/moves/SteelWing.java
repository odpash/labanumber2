package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
    public SteelWing() { super(Type.STEEL, 70, 90); }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < .1d)
            pokemon.setMod(Stat.DEFENSE, +1);
    }

    @Override
    protected String describe() {
        return "использует Steel Wing";
    }
}
