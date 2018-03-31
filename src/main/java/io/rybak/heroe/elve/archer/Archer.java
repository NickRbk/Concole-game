package io.rybak.heroe.elve.archer;

import io.rybak.race.impl.Elve;

public class Archer extends Elve {
    public int attack() {
        return 3;
    }


    public Archer() {
        super("archer");
    }
}
