package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super();
        type = Type.PSYCHIC;
    }
    @Override
    protected String describe() {
        return "использует Rest";
    }
}
